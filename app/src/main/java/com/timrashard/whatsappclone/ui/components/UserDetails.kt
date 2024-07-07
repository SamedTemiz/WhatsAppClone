package com.timrashard.whatsappclone.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.whatsappclone.domain.ChatListDataObject
import com.timrashard.whatsappclone.domain.Message
import com.timrashard.whatsappclone.domain.MessageDeliveryStatus
import com.timrashard.whatsappclone.domain.MessageType
import com.timrashard.whatsappclone.ui.theme.WhatsAppCloneTheme

@Composable
fun UserDetails(chatData: ChatListDataObject) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        MessageHeader(chatData)
        MessageSub(chatData)
    }
}

@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        TextComponent(
            value = chatData.userName,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = null,
        )

        TextComponent(
            value = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = if((chatData.message.unReadCount ?: 0) > 0) MaterialTheme.colorScheme.secondary else Color.Gray,
            modifier = null,
        )
    }
}

@Composable
fun MessageSub(chatData: ChatListDataObject) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        TextComponent(
            value = chatData.message.content,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = null
        )

        chatData.message.unReadCount?.let { count ->
            CircularCount(
                unReadCount = count.toString(),
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview(){
    WhatsAppCloneTheme {
        UserDetails(chatData = ChatListDataObject(
            chatID = 1,
            message = Message(
                content = "Good Morning darling!",
                timeStamp = "07/07/2024",
                type = MessageType.TEXT,
                deliveryStatus = MessageDeliveryStatus.DELIVERED,
                unReadCount = 18
            ),
            userName = "Samed Temiz",
        ))
    }
}
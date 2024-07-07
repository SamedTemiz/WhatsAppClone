package com.timrashard.whatsappclone.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timrashard.whatsappclone.data.chatList
import com.timrashard.whatsappclone.domain.ChatListDataObject
import com.timrashard.whatsappclone.ui.components.UserDetails
import com.timrashard.whatsappclone.ui.components.UserImage
import com.timrashard.whatsappclone.ui.theme.WhatsAppCloneTheme

@Preview(showBackground = true)
@Composable
fun ChatsScreenPreview() {
    WhatsAppCloneTheme {
        ChatsScreen()
    }
}

@Composable()
fun ChatsScreen(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {

        item{
            Spacer(modifier = Modifier.height(10.dp))
        }

        items(chatList){ chatData ->
            ChatListItem(chatData = chatData)
        }

    }
}

@Composable
fun ChatListItem(chatData: ChatListDataObject){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ){
        UserImage(chatData.userImage)
        UserDetails(chatData)
    }
}
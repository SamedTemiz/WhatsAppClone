package com.timrashard.whatsappclone.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timrashard.whatsappclone.R

@Composable
fun UserImage(userImage: Int) {
    Icon(
        modifier = Modifier
            .clip(CircleShape)
            .size(60.dp),
        painter = painterResource(id = userImage),
        contentDescription = "User Profile"
    )
}

@Preview
@Composable
fun UserImagePreview(){
    UserImage(userImage = R.drawable.ic_profile)
}
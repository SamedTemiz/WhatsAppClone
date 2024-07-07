package com.timrashard.whatsappclone.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timrashard.whatsappclone.ui.theme.WhatsAppCloneTheme

@Preview
@Composable
fun StatusScreenPreview() {
    WhatsAppCloneTheme {
        StatusScreen()
    }
}

@Composable
fun StatusScreen(){
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Status Screen")
    }
}
package com.timrashard.whatsappclone.domain

import com.timrashard.whatsappclone.R

data class ChatListDataObject(
    val chatID: Int,
    val message: Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_profile
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unReadCount: Int? = null
)

enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    SENT,
    PENDING,
    ERROR
}

enum class MessageType {
    TEXT,
    IMAGE,
    VIDEO,
    AUDIO,
}
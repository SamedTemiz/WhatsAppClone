package com.timrashard.whatsappclone.data

import com.timrashard.whatsappclone.domain.ChatListDataObject
import com.timrashard.whatsappclone.domain.Message
import com.timrashard.whatsappclone.domain.MessageDeliveryStatus
import com.timrashard.whatsappclone.domain.MessageType

val chatList = listOf(
    ChatListDataObject(
        chatID = 1,
        message = Message(
            content = "Good Morning darling!",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unReadCount = 2
        ),
        userName = "Samed Temiz",
    ),
    ChatListDataObject(
        chatID = 2,
        message = Message(
            content = "Hey, are we still on for lunch?",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Ayşe Yılmaz",
    ),
    ChatListDataObject(
        chatID = 3,
        message = Message(
            content = "Check out this cool photo!",
            timeStamp = "07/07/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.READ,
            unReadCount = 33
        ),
        userName = "Mehmet Öztürk",
    ),
    ChatListDataObject(
        chatID = 4,
        message = Message(
            content = "Meeting is rescheduled to 3 PM.",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Elif Demir",
    ),
    ChatListDataObject(
        chatID = 5,
        message = Message(
            content = "I'll be there in 10 minutes.",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Ahmet Kılıç",
    ),
    ChatListDataObject(
        chatID = 6,
        message = Message(
            content = "Can you send me the report?",
            timeStamp = "06/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Leyla Kaya",
    ),
    ChatListDataObject(
        chatID = 7,
        message = Message(
            content = "Don't forget the meeting tomorrow.",
            timeStamp = "06/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Fatih Özcan",
    ),
    ChatListDataObject(
        chatID = 8,
        message = Message(
            content = "Here's the document you requested.",
            timeStamp = "05/07/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Zeynep Şahin",
    ),
    ChatListDataObject(
        chatID = 9,
        message = Message(
            content = "Can we reschedule our call?",
            timeStamp = "05/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Kemal Kılıç",
    ),
    ChatListDataObject(
        chatID = 10,
        message = Message(
            content = "Happy birthday! 🎉",
            timeStamp = "04/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unReadCount = 1
        ),
        userName = "Merve Aksoy",
    ),
    ChatListDataObject(
        chatID = 11,
        message = Message(
            content = "I'll be there in 10 minutes.",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unReadCount = 6
        ),
        userName = "Ahmet Kılıç",
    ),
    ChatListDataObject(
        chatID = 12,
        message = Message(
            content = "Here's the document you requested.",
            timeStamp = "05/07/2024",
            type = MessageType.AUDIO,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Zeynep Şahin",
    ),
    ChatListDataObject(
        chatID = 13,
        message = Message(
            content = "Can you send me the report?",
            timeStamp = "06/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.SENT
        ),
        userName = "Leyla Kaya",
    ),
    ChatListDataObject(
        chatID = 14,
        message = Message(
            content = "Check out this cool photo!",
            timeStamp = "07/07/2024",
            type = MessageType.IMAGE,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Mehmet Öztürk",
    ),
    ChatListDataObject(
        chatID = 15,
        message = Message(
            content = "Don't forget the meeting tomorrow.",
            timeStamp = "06/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Fatih Özcan",
    ),
    ChatListDataObject(
        chatID = 16,
        message = Message(
            content = "Good Morning darling!",
            timeStamp = "07/07/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Samed Temiz",
    ),
)

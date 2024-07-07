package com.timrashard.whatsappclone.data

data class TabData(
    val title: String,
    val unReadCount: Int?
)

val tabs = listOf(
    TabData(title = Tabs.CHATS.value, unReadCount = 37),
    TabData(title = Tabs.STATUS.value, unReadCount = null),
    TabData(title = Tabs.CALLS.value, unReadCount = null)
)

enum class Tabs(val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}

const val INITIAL_SCREEN_INDEX = 0

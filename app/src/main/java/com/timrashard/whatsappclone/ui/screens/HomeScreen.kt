@file:OptIn(ExperimentalFoundationApi::class)

package com.timrashard.whatsappclone.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.timrashard.whatsappclone.data.INITIAL_SCREEN_INDEX
import com.timrashard.whatsappclone.data.tabs
import com.timrashard.whatsappclone.ui.components.AppBarComponent
import com.timrashard.whatsappclone.ui.components.TabsComponent
import com.timrashard.whatsappclone.ui.theme.WhatsAppCloneTheme
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(initialPage = INITIAL_SCREEN_INDEX, pageCount = { tabs.size })
    val scope = rememberCoroutineScope()

    Column {
        AppBarComponent()
        TabsComponent(
            initialIndex = INITIAL_SCREEN_INDEX,
            pagerState = pagerState,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }
        )

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState
        ) { page ->
            when(page){
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    WhatsAppCloneTheme {
        HomeScreen()
    }
}
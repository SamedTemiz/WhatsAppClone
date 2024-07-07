@file:OptIn(ExperimentalFoundationApi::class)

package com.timrashard.whatsappclone.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timrashard.whatsappclone.data.TabData
import com.timrashard.whatsappclone.data.tabs
import com.timrashard.whatsappclone.ui.theme.WhatsAppCloneTheme
import kotlinx.coroutines.flow.collectLatest

@Preview
@Composable
fun TabsComponentPreview() {
    WhatsAppCloneTheme {
//        TabsComponent()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabsComponent(
    initialIndex: Int = 0,
    pagerState: PagerState,
    onTabSelected: (Int) -> Unit
) {
    var selectedIndex by remember {
        mutableIntStateOf(initialIndex)
    }
    
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collectLatest { page ->
            selectedIndex = page
            onTabSelected(selectedIndex)
        }
    }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPosition ->
            SecondaryIndicator(
                modifier = Modifier.tabIndicatorOffset(tabPosition[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp
            )
        }
    ) {

        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                    onTabSelected(selectedIndex)
                },
                text = {
                    TabContent(tabData)
                }
            )
        }
    }
}

@Composable
fun TabContent(tabData: TabData) {
    if (tabData.unReadCount == null) {
        TabTitle(tabData.title)
    } else {
        TabWithUnReadCount(tabData)
    }
}

@Composable
fun TabTitle(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 16.sp,
        )
    )
}

@Composable
fun TabWithUnReadCount(tabData: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabTitle(title = tabData.title)

        tabData.unReadCount?.also { unReadCount ->
            CircularCount(
                unReadCount = unReadCount.toString(),
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.primary
            )
        }
    }
}
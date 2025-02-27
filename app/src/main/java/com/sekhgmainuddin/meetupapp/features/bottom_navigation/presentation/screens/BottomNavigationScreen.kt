package com.sekhgmainuddin.meetupapp.features.bottom_navigation.presentation.screens

import MeetupCloneTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodySmallText
import com.sekhgmainuddin.meetupapp.core.ui.navigation.BottomNavigationRoute

@Composable
fun BottomNavigationScreen(modifier: Modifier = Modifier) {
    val bottomNavController = rememberNavController()

    val bottomNavigationItems = listOf(
        BottomNavigationRoute.HomeScreenRoute,
        BottomNavigationRoute.ConnectionsScreenRoute,
        BottomNavigationRoute.ExploreScreenRoute,
        BottomNavigationRoute.NotificationsScreenRoute,
        BottomNavigationRoute.MessagesScreenRoute,
    )

    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .height(height = 72.dp)
            ) {
                bottomNavigationItems.forEach {
                    NavigationBarItem(
                        icon = { Icon(painterResource(it.selectedIcon), contentDescription = "", modifier = Modifier.size(24.dp)) },
                        label = { BodySmallText(text = LocalContext.current.getString(it.label), maxLines = 1) },
                        selected = bottomNavController.currentDestination?.route == it.route,
                        onClick = { bottomNavController.navigate(it.route) }
                    )
                }
            }
        }
    ) {
        Box(modifier = Modifier.padding(it))
    }
}

@Preview
@Composable
private fun BottomNavigationScreenPreview() {
    MeetupCloneTheme {
        BottomNavigationScreen()
    }
}
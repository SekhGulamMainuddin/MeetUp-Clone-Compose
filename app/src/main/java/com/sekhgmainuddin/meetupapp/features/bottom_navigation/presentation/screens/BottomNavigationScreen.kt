package com.sekhgmainuddin.meetupapp.features.bottom_navigation.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.sekhgmainuddin.meetupapp.core.ui.navigation.BottomNavigationRoute

@Preview()
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
            NavigationBar {
                bottomNavigationItems.forEach {
                    NavigationBarItem(
                        icon = { Icon(painterResource(it.selectedIcon), contentDescription = "") },
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
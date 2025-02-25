package com.sekhgmainuddin.meetupapp.core.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.sekhgmainuddin.meetupapp.R

object AppScreenRoutes {
    const val HOME_ROUTE = "home"
    const val CONNECTIONS_ROUTE = "connections"
    const val EXPLORE_ROUTE = "explore"
    const val NOTIFICATIONS_ROUTE = "notifications"
    const val MESSAGES_ROUTE = "messages"
}

sealed class BottomNavigationRoute(
    val route: String,
    @StringRes val label: Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
) {
    data object HomeScreenRoute : BottomNavigationRoute(
        AppScreenRoutes.HOME_ROUTE,
        R.string.home,
        R.drawable.home_selected_icon,
        R.drawable.home_unselected_icon,
    )

    data object ConnectionsScreenRoute :
        BottomNavigationRoute(
            AppScreenRoutes.CONNECTIONS_ROUTE,
            R.string.connections,
            R.drawable.connection_selected_icon,
            R.drawable.connection_selected_icon,
        )

    data object ExploreScreenRoute :
        BottomNavigationRoute(AppScreenRoutes.EXPLORE_ROUTE, R.string.explore, R.drawable.explore_icon, R.drawable.explore_icon)

    data object NotificationsScreenRoute :
        BottomNavigationRoute(
            AppScreenRoutes.NOTIFICATIONS_ROUTE,
            R.string.notifications,
            R.drawable.notification_selected_icon,
            R.drawable.notification_unselected_icon,
        )

    data object MessagesScreenRoute :
        BottomNavigationRoute(
            AppScreenRoutes.MESSAGES_ROUTE,
            R.string.messages,
            R.drawable.message_selected_icon,
            R.drawable.message_unselected_icon,
        )
}


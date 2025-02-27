package com.sekhgmainuddin.meetupapp.features.profile.presentation.screens

import MeetupCloneTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyMediumText
import com.sekhgmainuddin.meetupapp.features.profile.presentation.composables.CreateProfileAttendEventPage
import com.sekhgmainuddin.meetupapp.features.profile.presentation.composables.CreateProfileInterestsPage
import com.sekhgmainuddin.meetupapp.features.profile.presentation.composables.CreateProfileJoinGroupsPage
import com.sekhgmainuddin.meetupapp.features.profile.presentation.composables.CreateProfileLocationPage
import com.sekhgmainuddin.meetupapp.features.profile.presentation.composables.CreateProfileLookingForPage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateProfileScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val pagerState = rememberPagerState {
        0
    }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(
                        TopAppBarDefaults.TopAppBarExpandedHeight
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (pagerState.currentPage >= 2)
                    IconButton(
                        modifier = Modifier.padding(start = 5.dp),
                        onClick = {},
                    ) {
                        Icon(
                            Icons.AutoMirrored.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier.size(32.dp),
                            tint = MaterialTheme.colorScheme.outlineVariant
                        )
                    }

                if (pagerState.currentPage >= 2)
                    TextButton(
                        modifier = Modifier.padding(horizontal = 5.dp),
                        onClick = {},
                    ) {
                        BodyMediumText(text = context.getString(R.string.next), color = MaterialTheme.colorScheme.tertiary)
                    }

            }
        },
        bottomBar = {

        }
    ) {
        HorizontalPager(
            pagerState,
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
        ) {
            when (pagerState.currentPage) {
                0 -> CreateProfileLocationPage()
                1 -> CreateProfileInterestsPage()
                2 -> CreateProfileLookingForPage()
                3 -> CreateProfileJoinGroupsPage()
                4 -> CreateProfileAttendEventPage()
            }
        }
    }
}

@Preview
@Composable
private fun CreateProfileScreenPreview() {
    MeetupCloneTheme {
        CreateProfileScreen()
    }
}
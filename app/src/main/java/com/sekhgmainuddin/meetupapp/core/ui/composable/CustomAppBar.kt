package com.sekhgmainuddin.meetupapp.core.ui.composable

import MeetupCloneTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(
    modifier: Modifier = Modifier,
    title: String = "",
    onBackPressed: () -> Unit = {},
) {
    TopAppBar(
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = onBackPressed) {
                Icon(
                    Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = "",
                )
            }
        },
        title = { Text(title, style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(start = 20.dp)) },
    )
}

@Preview
@Composable
private fun CustomAppBarPreview() {
    MeetupCloneTheme {
        CustomAppBar(
            title = "MeetUp"
        )
    }
}
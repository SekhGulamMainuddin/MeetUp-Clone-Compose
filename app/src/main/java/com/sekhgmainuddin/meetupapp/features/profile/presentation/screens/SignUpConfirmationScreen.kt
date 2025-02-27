package com.sekhgmainuddin.meetupapp.features.profile.presentation.screens

import MeetupCloneTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.constants.Gender
import com.sekhgmainuddin.meetupapp.core.ui.composable.AppTextField
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyLargeText
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyMediumText
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodySmallText
import com.sekhgmainuddin.meetupapp.core.ui.composable.CustomAppBar
import com.sekhgmainuddin.meetupapp.core.ui.composable.PrimaryButton
import java.time.LocalDateTime

@Composable
fun SignUpConfirmationScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    var name by remember {
        mutableStateOf("")
    }

    var birthday by remember {
        mutableStateOf<LocalDateTime?>(null)
    }

    var gender by remember {
        mutableStateOf<Gender?>(null)
    }


    Scaffold(
        topBar = {
            CustomAppBar(
                onBackPressed = {},
                title = context.getString(R.string.sign_up_title_1)
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            Column(
                Modifier
                    .padding(horizontal = 15.dp)
                    .padding(top = 25.dp)
            ) {
                AppTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = name,
                    onValueChange = {
                        name = it
                    },
                    label = context.getString(R.string.name)
                )
                BodyMediumText(
                    modifier = Modifier.padding(top = 16.dp),
                    text = context.getString(R.string.name_desc),
                    color = MaterialTheme.colorScheme.outlineVariant
                )
            }

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 30.dp),
                thickness = 20.dp,
                color = MaterialTheme.colorScheme.surface
            )

            Column(
                Modifier.padding(horizontal = 15.dp)
            ) {
                BodyLargeText(
                    text = context.getString(R.string.birthdate),
                )
                BodyMediumText(
                    text = if(birthday == null) context.getString(R.string.not_set) else "",
                    color = MaterialTheme.colorScheme.outlineVariant
                )

                BodyLargeText(
                    modifier = Modifier.padding(top = 24.dp),
                    text = context.getString(R.string.gender),
                )
                BodyMediumText(
                    text = if(gender == null) context.getString(R.string.not_set) else "",
                    color = MaterialTheme.colorScheme.outlineVariant
                )

                BodyMediumText(
                    modifier = Modifier.padding(vertical = 24.dp),
                    text = context.getString(R.string.birthday_and_gender_desc),
                    color = MaterialTheme.colorScheme.outlineVariant
                )

                PrimaryButton(
                    modifier = Modifier
                        .height(52.dp)
                        .fillMaxWidth(),
                    buttonText = context.getString(R.string.sign_up_button_text),
                    buttonColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {},
                )
            }
        }
    }
}

@Preview
@Composable
private fun SignUpConfirmationScreenPreview() {
    MeetupCloneTheme {
        SignUpConfirmationScreen()
    }
}
package com.sekhgmainuddin.meetupapp.features.profile.presentation.screens

import MeetupCloneTheme
import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.ui.composable.AuthenticateWithEmailButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.AuthenticateWithFacebookButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.AuthenticateWithGoogleButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyMediumText
import com.sekhgmainuddin.meetupapp.core.ui.composable.CustomAppBar
import com.sekhgmainuddin.meetupapp.core.ui.composable.TermsAndConditionsComposable
import com.sekhgmainuddin.meetupapp.core.ui.composable.TitleMediumText

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            CustomAppBar(
                onBackPressed = {

                },
                title = context.getString(R.string.sign_up_title_1),
            )
        }
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            TitleMediumText(
                text = context.getString(R.string.sign_up_title_2),
            )
            BodyMediumText(
                modifier = Modifier.padding(top = 10.dp, bottom = 35.dp),
                text = context.getString(R.string.sign_up_desc),
                color = MaterialTheme.colorScheme.outlineVariant,
                textAlign = TextAlign.Center
            )

            AuthenticateWithGoogleButton { }

            AuthenticateWithEmailButton(
                modifier = Modifier.padding(vertical = 20.dp)
            ) { }

            AuthenticateWithFacebookButton { }

            Text(
                modifier = Modifier.padding(vertical = 20.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.outlineVariant,
                        ).toSpanStyle()
                    ) {
                        append(context.getString(R.string.already_have_an_account))
                        append(" ")
                    }
                    withLink(
                        LinkAnnotation.Clickable(
                            tag = "sign_in",
                            styles = TextLinkStyles(
                                MaterialTheme.typography.bodyMedium.copy(
                                    textDecoration = TextDecoration.Underline,
                                    color = MaterialTheme.colorScheme.tertiary,
                                ).toSpanStyle()
                            ),
                            linkInteractionListener = {
                                Toast.makeText(context, "Sign In", Toast.LENGTH_SHORT).show()
                            }
                        )
                    ) {
                        append(context.getString(R.string.sign_in))
                    }
                }
            )

            TermsAndConditionsComposable(
                modifier = Modifier.padding(top = 35.dp)
            )
        }
    }
}

@Preview
@Composable
private fun SignUpScreenPreview() {
    MeetupCloneTheme {
        SignUpScreen()
    }
}
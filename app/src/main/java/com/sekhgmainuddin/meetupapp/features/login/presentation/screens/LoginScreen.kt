package com.sekhgmainuddin.meetupapp.features.login.presentation.screens

import MeetupCloneTheme
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.ui.composable.AppTextField
import com.sekhgmainuddin.meetupapp.core.ui.composable.AuthenticateWithFacebookButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.AuthenticateWithGoogleButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyMediumText
import com.sekhgmainuddin.meetupapp.core.ui.composable.CustomAppBar
import com.sekhgmainuddin.meetupapp.core.ui.composable.PrimaryButton
import com.sekhgmainuddin.meetupapp.core.ui.composable.TermsAndConditionsComposable
import com.sekhgmainuddin.meetupapp.features.login.presentation.composables.PasswordTextField

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    var emailController by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val scrollState = rememberScrollState()

    val highlightTextStyle = TextLinkStyles(
        style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.tertiary,
            textDecoration = TextDecoration.Underline,
        ).toSpanStyle()
    )

    Scaffold(
        topBar = {
            CustomAppBar(
                onBackPressed = {

                },
                title = context.getString(R.string.login_title),
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(
                    vertical = 25.dp,
                    horizontal = 15.dp,
                )
                .imePadding() // Moves UI up when keyboard appears
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                AuthenticateWithGoogleButton {

                }

                AuthenticateWithFacebookButton(
                    modifier = Modifier
                        .padding(top = 20.dp)
                ) {

                }

                AppTextField(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    value = emailController,
                    onValueChange = { email ->
                        emailController = email
                    },
                    label = context.getString(R.string.email_label),
                    keyboardActions = KeyboardActions(
                        onDone = {

                        },
                    )
                )

                PasswordTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { p ->
                        password = p
                    },
                    keyboardActions = KeyboardActions(
                        onDone = {

                        },
                    )
                )

                PrimaryButton(
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .height(52.dp)
                        .fillMaxWidth(),
                    onClick = {},
                    buttonText = context.getString(R.string.login),
                    buttonColor = MaterialTheme.colorScheme.tertiary,
                )

                TextButton(
                    onClick = {},
                ) {
                    BodyMediumText(
                        modifier = Modifier.padding(10.dp),
                        text = context.getString(R.string.forgot_password),
                        color = MaterialTheme.colorScheme.tertiary,
                    )
                }

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.outlineVariant,
                            ).toSpanStyle()
                        ) {
                            append(context.getString(R.string.dont_have_account))
                            append(" ")
                        }
                        withLink(
                            LinkAnnotation.Clickable(
                                tag = "sign_up",
                                styles = highlightTextStyle,
                                linkInteractionListener = {
                                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
                                }
                            )
                        ) {
                            append(context.getString(R.string.sign_up_button_text))
                        }
                    }
                )

            }

            TermsAndConditionsComposable()
        }
    }
}

@Preview
@Composable
private fun LoginScreenPreview(modifier: Modifier = Modifier) {
    MeetupCloneTheme {
        LoginScreen()
    }
}
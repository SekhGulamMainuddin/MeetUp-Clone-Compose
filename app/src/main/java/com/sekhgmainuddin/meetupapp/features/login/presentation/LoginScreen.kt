package com.sekhgmainuddin.meetupapp.features.login.presentation

import MeetupCloneTheme
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
import com.sekhgmainuddin.meetupapp.core.ui.composable.AppTextField
import com.sekhgmainuddin.meetupapp.core.ui.composable.BodyMediumText
import com.sekhgmainuddin.meetupapp.core.ui.composable.PrimaryButton
import com.sekhgmainuddin.meetupapp.core.ui.theme.Blue1
import com.sekhgmainuddin.meetupapp.core.ui.theme.OnBackgroundLight
import com.sekhgmainuddin.meetupapp.features.login.presentation.composables.PasswordTextField

@OptIn(ExperimentalMaterial3Api::class)
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
            TopAppBar(
                navigationIcon = {
                    Icon(
                        Icons.AutoMirrored.Default.ArrowBack,
                        modifier = Modifier.padding(start = 20.dp, end = 30.dp),
                        contentDescription = "",
                    )
                },
                title = { Text(context.getString(R.string.login_title), style = MaterialTheme.typography.displaySmall) },
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
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = {},
                    buttonColor = Blue1,
                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(Color.White)
                            .padding(8.dp),
                        painter = painterResource(R.drawable.google_icon),
                        contentDescription = "",
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(context.getString(R.string.continue_with_google))
                    Spacer(modifier = Modifier.weight(1f))
                }

                PrimaryButton(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    onClick = {},
                    buttonColor = OnBackgroundLight,
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(R.drawable.facebook_icon),
                        contentDescription = "",
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(context.getString(R.string.continue_with_facebook))
                    Spacer(modifier = Modifier.weight(1f))
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

            Column {
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    buildAnnotatedString {
                        append(context.getString(R.string.meetup_declaration_1))
                        append(" ")

                        withLink(
                            LinkAnnotation.Clickable(
                                tag = "terms_of_service",
                                styles = highlightTextStyle,
                                linkInteractionListener = {
                                    Toast.makeText(context, "Terms Of Service", Toast.LENGTH_SHORT).show()
                                }
                            )
                        ) {
                            append(context.getString(R.string.terms_of_service))
                        }
                        append(". ")
                        append(context.getString(R.string.meetup_declaration_2))
                        append(" ")
                        withLink(
                            LinkAnnotation.Clickable(
                                tag = "privacy_policy",
                                styles = highlightTextStyle,
                                linkInteractionListener = {
                                    Toast.makeText(context, "Privacy Policy", Toast.LENGTH_SHORT).show()
                                }
                            )
                        ) {
                            append(context.getString(R.string.privacy_policy))
                        }
                        append(" ")
                        append(context.getString(R.string.meetup_declaration_3))
                        append(" ")
                        withLink(
                            LinkAnnotation.Clickable(
                                tag = "cookie_policy",
                                styles = highlightTextStyle,
                                linkInteractionListener = {
                                    Toast.makeText(context, "Cookie Policy", Toast.LENGTH_SHORT).show()
                                }
                            )
                        ) {
                            append(context.getString(R.string.cookie_policy))
                        }
                        append(".")
                    },
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.outlineVariant,
                    ),
                    textAlign = TextAlign.Center
                )
            }
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
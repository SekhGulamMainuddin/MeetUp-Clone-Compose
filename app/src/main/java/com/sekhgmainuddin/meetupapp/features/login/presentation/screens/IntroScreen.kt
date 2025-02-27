package com.sekhgmainuddin.meetupapp.features.login.presentation.screens

import MeetupCloneTheme
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.ui.composable.PrimaryButton
import com.sekhgmainuddin.meetupapp.core.ui.theme.SecondaryLight
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive

@Composable
fun IntroScreen(navController: NavController) {
    val context = LocalContext.current

    var backgroundImageIndex by remember {
        mutableIntStateOf(0)
    }

    val backgroundImages = listOf(
        R.drawable.meet_up_intro_image_1,
        R.drawable.meet_up_intro_image_2,
        R.drawable.meet_up_intro_image_3
    )

    LaunchedEffect(key1 = Unit) {
        while (isActive) {
            delay(5000)
            backgroundImageIndex = (backgroundImageIndex + 1) % 3
        }
    }

    Scaffold {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Crossfade(
                targetState = backgroundImageIndex, label = "",
                animationSpec = tween(1000)
            ) {
                AsyncImage(
                    modifier = Modifier.fillMaxSize(),
                    model = backgroundImages[it],
                    contentDescription = "",
                    contentScale = ContentScale.FillHeight,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 100.dp,
                        bottom = 60.dp,
                        start = 20.dp,
                        end = 20.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(0.6f),
                    painter = painterResource(R.drawable.meetup_text_image),
                    contentDescription = ""
                )

                Text(
                    modifier = Modifier.padding(vertical = 10.dp),
                    text = LocalContext.current.getString(R.string.intro_header),
                    style = MaterialTheme.typography.displayLarge,
                    color = SecondaryLight
                )

                Spacer(modifier = Modifier.weight(1f))

                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    textStyle = MaterialTheme.typography.titleSmall.copy(
                        color = SecondaryLight
                    ),
                    buttonText = context.getString(R.string.sign_up_button_text),
                    onClick = {}
                )

                TextButton(
                    modifier = Modifier.padding(top = 10.dp),
                    onClick = {}
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = MaterialTheme.typography.titleMedium.copy(
                                    textDecoration = TextDecoration.Underline,
                                    color = SecondaryLight,
                                ).toSpanStyle()
                            ) {
                                append(context.getString(R.string.already_have_an_account))
                                append(" ")
                            }
                            withStyle(
                                style = MaterialTheme.typography.titleMedium.copy(
                                    textDecoration = TextDecoration.Underline,
                                    color = SecondaryLight,
                                    fontWeight = FontWeight.ExtraBold,
                                ).toSpanStyle()
                            ) {
                                append(context.getString(R.string.login))
                            }
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun IntroScreenPreview(modifier: Modifier = Modifier) {
    MeetupCloneTheme(darkTheme = false) {
        IntroScreen(rememberNavController())
    }
}
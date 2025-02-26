package com.sekhgmainuddin.meetupapp.core.ui.composable

import MeetupCloneTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R
import com.sekhgmainuddin.meetupapp.core.ui.theme.Blue1
import com.sekhgmainuddin.meetupapp.core.ui.theme.OnBackgroundLight

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    buttonText: String = "",
    textStyle: TextStyle? = null,
    border: BorderStroke? = null,
    buttonColor: Color = MaterialTheme.colorScheme.primary,
    shape: Shape = RoundedCornerShape(size = 8.dp),
    contentPadding: PaddingValues = PaddingValues(10.dp),
    onClick: () -> Unit,
    content: @Composable (RowScope.() -> Unit)? = null,
) {
    ElevatedButton(
        modifier = modifier,
        onClick = onClick,
        border = border,
        colors = ButtonDefaults.elevatedButtonColors().copy(
            containerColor = buttonColor
        ),
        contentPadding = contentPadding,
        shape = shape,
        content = content ?: {
            Text(
                text = buttonText,
                style = textStyle ?: MaterialTheme.typography.titleSmall,
            )
        }
    )
}

@Preview()
@Composable
private fun PrimaryButtonPreview() {
    MeetupCloneTheme {
        PrimaryButton(modifier = Modifier.fillMaxWidth(), buttonText = "Login", onClick = {})
    }
}

@Composable
fun AuthenticateWithGoogleButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick,
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
        TitleSmallText(text = LocalContext.current.getString(R.string.continue_with_google))
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview()
@Composable
private fun AuthenticateWithGoogleButtonPreview() {
    MeetupCloneTheme {
        AuthenticateWithGoogleButton(onClick = {})
    }
}

@Composable
fun AuthenticateWithFacebookButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick,
        buttonColor = MaterialTheme.colorScheme.background,
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
        TitleSmallText(text = LocalContext.current.getString(R.string.continue_with_facebook))
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview()
@Composable
private fun AuthenticateWithFacebookButtonPreview() {
    MeetupCloneTheme {
        AuthenticateWithFacebookButton(onClick = {})
    }
}

@Composable
fun AuthenticateWithEmailButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick,
        buttonColor = MaterialTheme.colorScheme.onBackground,
        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
    ) {
        Icon(
            modifier = Modifier
                .size(30.dp),
            imageVector = Icons.Outlined.MailOutline,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.outline.copy(
                alpha = 0.5f
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        TitleSmallText(text = LocalContext.current.getString(R.string.continue_with_email), color = MaterialTheme.colorScheme.background)
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview()
@Composable
private fun AuthenticateWithEmailButtonPreview() {
    MeetupCloneTheme {
        AuthenticateWithEmailButton(onClick = {})
    }
}
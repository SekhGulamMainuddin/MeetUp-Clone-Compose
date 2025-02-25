package com.sekhgmainuddin.meetupapp.core.ui.composable

import MeetupCloneTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(modifier: Modifier = Modifier, buttonText: String, textStyle: TextStyle? = null, onClick: () -> Unit) {
    ElevatedButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.elevatedButtonColors().copy(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(size = 12.dp)
    ) {
        Text(
            text = buttonText,
            style = textStyle ?: MaterialTheme.typography.titleSmall,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PrimaryButtonPreview() {
    MeetupCloneTheme {
        PrimaryButton(modifier = Modifier.fillMaxWidth(), buttonText = "Login", onClick = {})
    }
}
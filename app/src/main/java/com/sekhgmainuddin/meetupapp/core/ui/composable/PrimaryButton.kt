package com.sekhgmainuddin.meetupapp.core.ui.composable

import MeetupCloneTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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

@Preview(showBackground = true)
@Composable
private fun PrimaryButtonPreview() {
    MeetupCloneTheme {
        PrimaryButton(modifier = Modifier.fillMaxWidth(), buttonText = "Login", onClick = {})
    }
}
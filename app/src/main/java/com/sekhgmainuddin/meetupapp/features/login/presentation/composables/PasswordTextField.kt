package com.sekhgmainuddin.meetupapp.features.login.presentation.composables

import MeetupCloneTheme
import android.opengl.Visibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R

@Composable
fun PasswordTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    labelStyle: TextStyle = MaterialTheme.typography.bodyMedium.copy(
        color = MaterialTheme.colorScheme.tertiary,
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    errorText: String? = null,
) {
    var passwordVisibility by remember {
        mutableStateOf(false)
    }

    Column {
        TextField(
            modifier = modifier,
            value = value,
            textStyle = textStyle,
            onValueChange = onValueChange,
            label = {
                Text(text = LocalContext.current.getString(R.string.password_label), style = labelStyle)
            },
            trailingIcon = {
                Icon(
                    if (passwordVisibility) painterResource(R.drawable.password_visible_icon) else painterResource(R.drawable.password_obscure_icon),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.tertiary,
                    modifier = Modifier.clickable {
                        passwordVisibility = !passwordVisibility
                    },
                )
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            singleLine = true,
            keyboardActions = keyboardActions,
            colors = TextFieldDefaults.colors().copy(
                focusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.outlineVariant,
                disabledIndicatorColor = MaterialTheme.colorScheme.outline,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                cursorColor = MaterialTheme.colorScheme.tertiary,
            )
        )

        if (errorText != null)
            Text(
                text = errorText,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.error,
                ),
                modifier = Modifier.padding(top = 8.dp)
            )
    }
}

@Preview
@Composable
private fun PasswordTextFieldPreview(modifier: Modifier = Modifier) {
    var textFieldValue by remember {
        mutableStateOf("")
    }
    MeetupCloneTheme {
        PasswordTextField(
            value = textFieldValue,
            onValueChange = {
                textFieldValue = it
            },
        )
    }
}
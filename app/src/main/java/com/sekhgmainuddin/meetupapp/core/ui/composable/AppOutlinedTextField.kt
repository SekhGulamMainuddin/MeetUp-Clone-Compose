package com.sekhgmainuddin.meetupapp.core.ui.composable

import MeetupCloneTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppOutlinedTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String? = null,
    customLabel: @Composable (() -> Unit)? = null,
    singleLine: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    labelStyle: TextStyle = MaterialTheme.typography.bodyMedium.copy(
        color = MaterialTheme.colorScheme.tertiary,
    ),
    placeholderText: String? = null,
    placeholderTextStyle: TextStyle = MaterialTheme.typography.bodyMedium.copy(
        color = MaterialTheme.colorScheme.outlineVariant,
    ),
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    errorText: String? = null,
) {
    Column {
        OutlinedTextField(
            modifier = modifier,
            value = value,
            textStyle = textStyle,
            onValueChange = onValueChange,
            label = customLabel ?: {
                if (label != null)
                    Text(text = label, style = labelStyle)
            },
            trailingIcon = trailingIcon,
            leadingIcon = leadingIcon,
            placeholder = placeholder ?: placeholderText?.let { { Text(text = it, style = placeholderTextStyle) } },
            singleLine = singleLine,
            keyboardActions = keyboardActions,
            keyboardOptions = keyboardOptions,
            colors = OutlinedTextFieldDefaults.colors().copy(
                focusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.outlineVariant,
                disabledIndicatorColor = MaterialTheme.colorScheme.outline,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                cursorColor = MaterialTheme.colorScheme.secondary,
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
private fun AppOutlinedTextFieldPreview(modifier: Modifier = Modifier) {
    var textFieldValue by remember {
        mutableStateOf("")
    }
    MeetupCloneTheme {
        AppOutlinedTextField(
            value = textFieldValue,
            label = "Email",
            onValueChange = {
                textFieldValue = it
            },
        )
    }
}
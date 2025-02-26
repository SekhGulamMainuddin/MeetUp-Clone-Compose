package com.sekhgmainuddin.meetupapp.core.ui.composable

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.meetupapp.R

@Composable
fun TermsAndConditionsComposable(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    val highlightTextStyle = TextLinkStyles(
        style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.tertiary,
            textDecoration = TextDecoration.Underline,
        ).toSpanStyle()
    )

    Column(
        modifier
    ) {
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
package com.sekhgmainuddin.meetupapp.core.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BodyLargeText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun BodyMediumText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun BodySmallText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun TitleLargeText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun TitleMediumText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.titleMedium,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun TitleSmallText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.titleSmall,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun HeadlineLargeText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineLarge,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun HeadlineMediumText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun HeadlineSmallText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun LabelLargeText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelLarge,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun LabelMediumText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelMedium,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun LabelSmallText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelSmall,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}


@Composable
fun DisplayLargeText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelLarge,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun DisplayMediumText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelMedium,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun DisplaySmallText(
    modifier: Modifier = Modifier, text: String,
    color: Color? = Color.Unspecified,
    textAlign: TextAlign? = null,
    decoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int? = Int.MAX_VALUE,
) {
    Text(

        text,
        modifier = modifier,
        style = MaterialTheme.typography.labelSmall,
        color = color ?: Color.Unspecified,
        textAlign = textAlign,
        textDecoration = decoration,
        overflow = overflow,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Preview(showBackground = true)
@Composable
private fun BodyLargeTextPreview() {
    BodyLargeText(text = "BodyLargeText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun BodyMediumTextPreview() {
    BodyMediumText(text = "BodyMediumText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun BodySmallTextPreview() {
    BodySmallText(text = "BodySmallText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun TitleLargeTextPreview() {
    TitleLargeText(text = "TitleLargeText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun TitleMediumTextPreview() {
    TitleMediumText(text = "TitleMediumText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun TitleSmallTextPreview() {
    TitleSmallText(text = "TitleSmallText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun HeadlineLargeTextPreview() {
    HeadlineLargeText(text = "HeadlineLargeText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun HeadlineMediumTextPreview() {
    HeadlineMediumText(text = "HeadlineMediumText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun HeadlineSmallTextPreview() {
    HeadlineSmallText(text = "HeadlineSmallText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun LabelLargeTextPreview() {
    LabelLargeText(text = "LabelLargeText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun LabelMediumTextPreview() {
    LabelMediumText(text = "LabelMediumText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun LabelSmallTextPreview() {
    LabelSmallText(text = "LabelSmallText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun DisplayLargeTextPreview() {
    DisplayLargeText(text = "DisplayLargeText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun DisplayMediumTextPreview() {
    DisplayMediumText(text = "DisplayMediumText", modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Composable
private fun DisplaySmallTextPreview() {
    DisplaySmallText(text = "DisplaySmallText", modifier = Modifier.padding(8.dp))
}

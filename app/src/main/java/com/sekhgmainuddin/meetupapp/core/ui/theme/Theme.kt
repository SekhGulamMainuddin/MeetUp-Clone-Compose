import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.sekhgmainuddin.meetupapp.core.ui.theme.*

@Composable
fun MeetupCloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // TODO : Revert theme to system default
    val colorScheme = if (true) {
        darkColorScheme(
            primary = PrimaryDark,
            secondary = SecondaryDark,
            tertiary = TertiaryDark,
            background = BackgroundDark,
            surface = SurfaceDark,
            onPrimary = OnPrimaryDark,
            onBackground = OnBackgroundDark,
            onSurface = OnSurfaceDark,
            error = ErrorDark,
            outline = OutlineDark,
            outlineVariant = OutlineVariantDark,
        )
    } else {
        lightColorScheme(
            primary = PrimaryLight,
            secondary = SecondaryLight,
            tertiary = TertiaryLight,
            background = BackgroundLight,
            surface = SurfaceLight,
            onPrimary = OnPrimaryLight,
            onBackground = OnBackgroundLight,
            onSurface = OnSurfaceLight,
            error = ErrorLight,
            outline = OutlineLight,
            outlineVariant = OutlineVariantLight
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = colorScheme.getTypography(),
        content = content,
    )
}

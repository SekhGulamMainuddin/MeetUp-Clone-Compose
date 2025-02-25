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
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = PrimaryDark,
            secondary = SecondaryDark,
            tertiary = TertiaryDark,
            background = BackgroundDark,
            surface = SurfaceDark,
            onPrimary = OnPrimaryDark,
            onBackground = OnBackgroundDark,
            onSurface = OnSurfaceDark,
            error = ErrorDark
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
            error = ErrorLight
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = colorScheme.getTypography(),
        content = content
    )
}

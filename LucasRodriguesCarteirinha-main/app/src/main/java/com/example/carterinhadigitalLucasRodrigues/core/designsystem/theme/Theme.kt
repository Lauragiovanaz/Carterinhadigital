
package com.example.carterinhadigitalLucasRodrigues.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Tema escuro
private val darkScheme = darkColorScheme(
    primary = RedPrimary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFF49366B),
    onPrimaryContainer = Color.White,

    secondary = RedAccent,
    onSecondary = Color(0xFF30243D),
    secondaryContainer = Color(0xFF49366B),
    onSecondaryContainer = Color.White,

    tertiary = Color(0xFFCEB8F2),
    onTertiary = Color(0xFF30243D),

    background = DarkBackground,
    onBackground = DarkOnBackground,

    surface = DarkSurface,
    onSurface = DarkOnSurface,

    surfaceVariant = Color(0xFF352B42),
    onSurfaceVariant = DarkOnSurfaceVariant,

    outline = DarkCardBorder,
    outlineVariant = DarkCardBorder.copy(alpha = 0.5f),

    error = Color(0xFFFF5252)
)

// Tema claro
private val lightScheme = lightColorScheme(
    primary = RedPrimary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE8DDF8),
    onPrimaryContainer = Color(0xFF49366B),

    secondary = RedAccent,
    onSecondary = Color(0xFF30243D),
    secondaryContainer = Color(0xFFEDE3FA),
    onSecondaryContainer = Color(0xFF49366B),

    tertiary = Color(0xFFB39DDB),
    onTertiary = Color(0xFF30243D),

    background = LightBackground,
    onBackground = LightOnBackground,

    surface = LightSurface,
    onSurface = LightOnSurface,

    surfaceVariant = Color(0xFFF0E9FA),
    onSurfaceVariant = LightOnSurfaceVariant,

    outline = LightCardBorder,
    outlineVariant = LightCardBorder.copy(alpha = 0.5f),

    error = Color(0xFFB00020)
)

@Composable
fun CarteirinhaDigital2DEVESTTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) darkScheme else lightScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}


package com.example.carterinhadigitalLucasRodrigues.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

// Família de fontes
val bodyFontFamily = FontFamily.Default
val displayFontFamily = FontFamily.Default

// Tipografia padrão
val baseline = Typography()

// Tipografia personalizada do aplicativo
val AppTypography = Typography(

    // Títulos principais
    displayLarge = baseline.displayLarge.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold
    ),
    displayMedium = baseline.displayMedium.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold
    ),
    displaySmall = baseline.displaySmall.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold
    ),

    // Cabeçalhos
    headlineLarge = baseline.headlineLarge.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold
    ),
    headlineMedium = baseline.headlineMedium.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.SemiBold
    ),
    headlineSmall = baseline.headlineSmall.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.SemiBold
    ),

    // Títulos de cards e seções
    titleLarge = baseline.titleLarge.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.SemiBold
    ),
    titleMedium = baseline.titleMedium.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Medium
    ),
    titleSmall = baseline.titleSmall.copy(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Medium
    ),

    // Textos
    bodyLarge = baseline.bodyLarge.copy(
        fontFamily = bodyFontFamily
    ),
    bodyMedium = baseline.bodyMedium.copy(
        fontFamily = bodyFontFamily
    ),
    bodySmall = baseline.bodySmall.copy(
        fontFamily = bodyFontFamily
    ),

    // Botões e legendas
    labelLarge = baseline.labelLarge.copy(
        fontFamily = bodyFontFamily,
        fontWeight = FontWeight.SemiBold
    ),
    labelMedium = baseline.labelMedium.copy(
        fontFamily = bodyFontFamily
    ),
    labelSmall = baseline.labelSmall.copy(
        fontFamily = bodyFontFamily
    )
)

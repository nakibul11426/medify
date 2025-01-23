package com.alex.medify.navigation

sealed class Screen(val route: String) {
    data object SplashScreen : Screen("splash_screen")
    data object StartingScreen : Screen("starting_screen")
    data object RegistrationScreen : Screen("registration_screen")
    data object LoginScreen : Screen("login_screen")
}
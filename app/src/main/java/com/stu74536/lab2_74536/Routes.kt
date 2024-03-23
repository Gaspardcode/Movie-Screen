package com.stu74536.lab2_74536

sealed class Routes(val route: String) {
    object FirstScreen : Routes("Home")
    object SecondScreen : Routes("movie_screen")
}
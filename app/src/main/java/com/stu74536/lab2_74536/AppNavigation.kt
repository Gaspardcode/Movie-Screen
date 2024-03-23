package com.stu74536.lab2_74536

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen.route,
    ) {
        composable(Routes.FirstScreen.route)
        {
            MovieHome(navController = navController)
        }
        composable(Routes.SecondScreen.route + "/{movieId}")
        { backStackEntry ->
            val arg = backStackEntry.arguments?.getString("movieId")
            var id = 1
            if(arg != null)
                 id = arg.toInt();
            val movie = DataProvider.movieList.find { it.id == id}
            //val movie = DataProvider.movieList.find { it.name == id}
            if(movie != null)
                MovieScreen(movie,navController = navController)
        }
    }
}

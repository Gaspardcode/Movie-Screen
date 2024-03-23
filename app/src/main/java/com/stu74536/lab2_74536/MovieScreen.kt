package com.stu74536.lab2_74536

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.stu74536.lab2_74536.ui.theme.roboto
import android.util.Log
import androidx.navigation.NavController

@Composable
fun MovieScreen(movie: Movie, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Image(painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "A back arrow",
            modifier = Modifier
                .size(width = 20.dp, height = 20.dp)
                .clickable {
                /* Back To Home Screen*/
                    navController.navigate(Routes.FirstScreen.route)
                //   Log.d("TAG", movie.seats_remaining.toString() + " | " + movie.seats_selected.toString())
                })
        Image(painter = painterResource(id = movie.imageId) ,
            contentDescription = "A movie cover",
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            contentScale = ContentScale.Crop)
        Bottom(movie)
    }
}

fun conv(movie: Movie) :String
{
    var stares = "";
    for (i in movie.starring)
        stares +="$i, "
    stares.removeSuffix(", ")
    return stares
}
@Composable
fun Bottom(movie: Movie)
{
    var seats_selected by remember { mutableStateOf(movie.seats_selected) }
    var seats_remaining by remember { mutableStateOf(movie.seats_remaining) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = movie.name,
                style = typography.titleLarge,
                color = Color.White,
                fontFamily = roboto
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = movie.certification) ,
                contentDescription = "A seat",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row() {
        Text(text = "Staring ",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = typography.bodyMedium,
            fontFamily = roboto)
        Text(text = conv(movie),
            color = Color.Gray,
            style = typography.bodyMedium,
            fontFamily = roboto)
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Text(text = "Running time ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = typography.bodyMedium,
                fontFamily = roboto)
            Text(text = (movie.running_time_mins / 60).toString() + "hr " + (movie.running_time_mins % 60).toString() + "mins",
                color = Color.Gray,
                style = typography.bodyMedium,
                fontFamily = roboto)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text= movie.description,
            color = Color.LightGray,
            style = typography.bodyMedium,
            fontFamily = roboto)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Select Seats",
                color = Color.White,
                style = typography.titleLarge,
                fontFamily = roboto)
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = if(seats_selected == 0) R.drawable.minus_grey else R.drawable.minus_white) ,
                contentDescription = "A minus sign",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .clickable {
                        if (seats_selected > 0) {
                            seats_selected -= 1;
                            seats_remaining += 1;
                            movie.seats_selected = seats_selected
                            movie.seats_remaining = seats_remaining
                        }
                    })
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = seats_selected.toString(),            /* HERE */
                fontFamily = roboto,
                modifier = Modifier)
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = if(seats_remaining == 0) R.drawable.add_grey else R.drawable.add_white),
                contentDescription = "A plus sign",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .clickable {
                        if (seats_remaining > 0) {
                            seats_selected += 1
                            seats_remaining -= 1
                            movie.seats_selected = seats_selected
                            movie.seats_remaining = seats_remaining
                        }
                    })
            Spacer(modifier = Modifier.fillMaxWidth(0.1f))
            Image(painter = painterResource(id = R.drawable.seat) ,
                contentDescription = "A seat",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "$seats_remaining seats remaining",
                color = Color.White,
                style = typography.titleLarge,
                fontFamily = roboto)
        }
    }
}
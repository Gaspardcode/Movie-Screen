package com.stu74536.lab2_74536
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stu74536.lab2_74536.ui.theme.roboto

@Composable
private fun MovieImage(movie: Movie) {
    Image(
        painter = painterResource(id = movie.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

@Composable
fun MovieListItem(movie: Movie, navController: NavController, modifier: Modifier = Modifier) {

    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate(Routes.SecondScreen.route + "/" + movie.id) },
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            MovieImage(movie)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center) {

                Text(text = movie.name, style = typography.titleMedium, fontFamily = roboto)
                if(movie.seats_selected > 0)
                {
                    Text(text = movie.seats_selected.toString() + " seats selected !",
                        style = typography.bodyMedium,
                        fontFamily = roboto,
                        color = Color.Green
                    )
                }
                else {
                    Text(
                        text = movie.seats_remaining.toString() + " seats remaining !",
                        style = typography.bodyMedium,
                        fontFamily = roboto,
                        color = Color.White
                    )
                }
            }
        }
    }
}
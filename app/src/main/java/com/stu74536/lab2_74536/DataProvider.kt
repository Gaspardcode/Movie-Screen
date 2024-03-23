package com.stu74536.lab2_74536

import com.stu74536.lab2_74536.Movie
import kotlin.random.Random

object DataProvider {
    val movieList = listOf(
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 0,
        ),
        Movie(
            name = "GHOSTBUSTERS: FROZEN EMPIRE",
            imageId = R.drawable.ghost,
            certification = R.drawable.douzea,
            description = "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – " +
                    "to team up with the original Ghostbusters, who’ve developed a top-secret research lab to take busting ghosts to the next level. " +
                    "But when the discovery of an ancient artifact unleashes an evil force," +
                    " Ghostbusters new and old must join forces to protect their home and save the world from a second Ice Age.\n",
            starring = arrayOf("Paul Rudd", "Bill Murray", "Finn Wolfhard", "Dan Aykroud", "Annie Potts", "Mckenna Grace", "Ernie Hudson"),
            running_time_mins = 144,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 1
        ),
        Movie(
            name = "IMMACULATE",
            imageId = R.drawable.immaculate,
            certification = R.drawable.seize,
            description = "Cecilia, a woman of devout faith, is warmly welcomed to the picture-perfect " +
                    "Italian countryside where she is offered a new role at an illustrious convent. " +
                    "But it becomes clear to Cecilia that her new home harbors dark and horrifying secrets.\n",
            starring = arrayOf("Sydney Sweeney", "Benedetta Porcaroli", "Álvaro Morte", "Simona Tabasco"),
            running_time_mins = 89,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 2
        ),
        Movie(
            name = "IMAGINARY",
            imageId = R.drawable.imaginary,
            certification = R.drawable.quinzea,
            description = "From Blumhouse, the genre-defining masterminds behind FIVE NIGHTS AT FREDDY’S and M3GAN. " +
                    "When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice (Pyper Braun) develops an eerie attachment" +
                    " to a stuffed bear named Chauncey she finds in the basement. Alice starts playing games with Chauncey that begin playful " +
                    "and become increasingly sinister. As Alice’s behaviour becomes more and more concerning," +
                    " Jessica intervenes only to realize Chauncey is much more than the stuffed toy bear she believed him to be.\n",
            starring = arrayOf("Betty Buckley", "DeWanda Wise", "Tom Payne"),
            running_time_mins = 104,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 3
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 4
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 5
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 6
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 7
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 8
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 9
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 10
        ),
        Movie(
            name = "DUNE: PART TWO",
            imageId = R.drawable.dune,
            certification = R.drawable.douzea,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the" +
                    " known universe, he endeavors to prevent a terrible future only he can foresee.\n",
            starring = arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            running_time_mins = 166,
            seats_remaining = Random.nextInt(0, 15),
            seats_selected = 0,
            id = 11
        )
    )
}
package view

import model.MusicGender
import model.MovieGender
import model.MovieRating

fun main() {
    val musicController = controller.Music()
    val sweetChildOMine = musicController.musicFactory(
        title = "Sweet Child O Mine",
        composer = "Guns n Roses",
        album = "Appetite for Destruction",
        yearOfRelease = 1988,
        record = "Geffen Records",
        musicGender = MusicGender.ROCK,
        duration = 140
    )
    val movieController = controller.Movie()
    val ironGiant = movieController.movieFactory(
        title = "The Iron Giant",
        movieGender = MovieGender.ANIMATION,
        duration = 1440,
        isPreRelease = false,
        yearOfRelease = 1999,
        director = "Brad Bird",
        screenwriter = "Tim McCanlies"

    )

    println(sweetChildOMine)
    //println(sweetChildOMine.composer)
}
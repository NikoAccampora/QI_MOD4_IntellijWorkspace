package view

import model.MusicGender

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

    println(sweetChildOMine)
    //println(sweetChildOMine.composer)
}
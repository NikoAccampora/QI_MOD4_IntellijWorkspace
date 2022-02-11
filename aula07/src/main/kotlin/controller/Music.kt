package controller

import model.MusicGender

class Music {
    // Parâmetros do método Factory
    fun musicFactory(
        title: String,
        duration: Short,
        musicGender: MusicGender,
        yearOfRelease: Short,
        album: String,
        composer: String,
        record: String
    ) = model.Music(

        // Construtor da class Music do model
    )
}
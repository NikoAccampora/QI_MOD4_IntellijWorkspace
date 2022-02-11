package model

data class Music(
    var title: String,
    var duration: Short,
    var musicGender: MusicGender,
    var yearOfRelase: Short,
    var album: String,
    var composer: String,
    var record: String
)

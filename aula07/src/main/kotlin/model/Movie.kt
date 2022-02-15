package model

import java.time.Duration

data class Movie(
    var title: String,
    var movieGender: String, //Enum
    var duration: Short,
    var rating: String, //Enum
    var isPreRelease: Boolean,
    var yearOfRealease: Short,
    var director: String,
    var screenwriter: String,
)

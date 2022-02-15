package model

data class Movie(
    var title: String,
    var movieGender: MovieGender,
    var duration: Short,
    var rating: MovieRating,
    var isPreRelease: Boolean,
    var yearOfRealease: Short,
    var director: String,
    var screenwriter: String,
)

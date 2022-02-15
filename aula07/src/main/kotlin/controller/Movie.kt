package controller

import model.MovieGender
import model.MovieRating

class Movie {
      // Parâmetros do método Factory
  fun movieFactory(
        title: String,
        movieGender: MovieGender,
        duration: Short,
        rating: MovieRating,
        isPreRelease: Boolean,
        yearOfRealease: Short,
        director: String,
        screenwriter: String,
  ) = model.Movie(
      // Construtor da class Music do model
      title = title,
      movieGender = movieGender,
      duration = duration,
      rating = rating,
      isPreRelease = isPreRelease,
      yearOfRealease = yearOfRealease,
      director = director,
      screenwriter = screenwriter
  )
}
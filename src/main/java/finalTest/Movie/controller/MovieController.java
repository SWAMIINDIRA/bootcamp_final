package finalTest.Movie.controller;

import finalTest.Movie.service.MovieService;

public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }


}

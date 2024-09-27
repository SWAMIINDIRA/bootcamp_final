package finalTest.Movie.service.Impl;

import finalTest.Movie.dto.MovieRequest;
import finalTest.Movie.entity.Movie;
import finalTest.Movie.repository.MovieRepository;
import finalTest.Movie.service.MovieService;

import java.util.Optional;

public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository){

        this.movieRepository = movieRepository;
    }

    @Override
    public String save(MovieRequest request){
        saveToDB(request);
        return "success";
    }

    @Override
    public String get(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()){
            return "success";
        } else {
            return "Data not found";
        }
    }



    private void saveToDB(MovieRequest request){
        Movie movie = new Movie();

        movie.setTitle(request.getTitle());
        movie.setGenre(request.getGenre());
        movie.setDirector(request.getDirector());
        movie.setRating(request.getRating());

        movieRepository.save(movie);
    }


}

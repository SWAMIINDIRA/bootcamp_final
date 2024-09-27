package finalTest.Movie.service;

import finalTest.Movie.dto.MovieRequest;

public interface MovieService {
    String save(MovieRequest request);

    String get(Long id);
}

package anstar.movie.service;

import  anstar.movie.domain.dto.*;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    void creatMovie(CreateMovieDto createMovieDto);

    void deleteMovie(Long movieId);

    DetailsMovieDto findMovie(Long movieId);

    MovieCounterDto countMovies(String title);

    void updateMovie(Long movieId, UpdateMovieDto updateMovieDto);


    List<MovieDto> searchMovie(String title);
}

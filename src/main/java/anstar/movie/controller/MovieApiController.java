package anstar.movie.controller;

import anstar.movie.domain.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import anstar.movie.*;
import  anstar.movie.service.MovieService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class MovieApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieApiController.class);

    private final MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin
    @GetMapping(value = "/movies")
    public ResponseEntity<List<MovieDto>> searchMovie(@RequestParam(name = "search") String search) {
        LOGGER.info("find all movies");
        List<MovieDto> moviesDto = movieService.searchMovie(search);
        return new ResponseEntity<>(moviesDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/movies")
    public ResponseEntity<?> createMovie(@RequestBody CreateMovieDto createMovieDto) {
        LOGGER.info("create movie: {}", createMovieDto);
        movieService.creatMovie(createMovieDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping(value = "/movies/{movieId}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long movieId) {
        LOGGER.info("delete movie: {}", movieId);
        movieService.deleteMovie(movieId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/{movieId}")
    public ResponseEntity<DetailsMovieDto> detailsMovie(@PathVariable Long movieId) {
        LOGGER.info("details movie: {}", movieId);
        DetailsMovieDto detailsMovieDto = movieService.findMovie(movieId);

        return new ResponseEntity<>(detailsMovieDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(value = "/movies/{movieId}")
    public ResponseEntity<Void> updateMovie(@RequestBody UpdateMovieDto updateMovieDto,
                                            @PathVariable Long movieId) {
        LOGGER.info("update movie: {}", movieId);
        movieService.updateMovie(movieId, updateMovieDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/counter")
    public ResponseEntity<MovieCounterDto> countMovies(@RequestParam(name = "search") String search) {
        LOGGER.info("count movies");

        MovieCounterDto movieCounterDto = movieService.countMovies(search);
        return new ResponseEntity<>(movieCounterDto, HttpStatus.OK);
    }



}

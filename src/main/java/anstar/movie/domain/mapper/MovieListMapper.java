package anstar.movie.domain.mapper;

import org.springframework.stereotype.Component;
import  anstar.movie.domain.dto.MovieDto;
import  anstar.movie.domain.entity.Movie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapper implements Converter<List<MovieDto>, List<Movie>> {

    @Override
    public List<MovieDto> convert(List<Movie> movies) {

        return movies.stream()
                .map(movie -> new MovieDto.Builder()
                        .movieId(movie.getMovieId())
                        .title(movie.getTitle())
                        .image(movie.getImage())
                        .year(movie.getYear())
                        .build())
                .collect(Collectors.toList());
    }
}

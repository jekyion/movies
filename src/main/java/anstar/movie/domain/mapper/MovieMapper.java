package anstar.movie.domain.mapper;

import org.springframework.stereotype.Component;
import  anstar.movie.domain.dto.CreateMovieDto;
import  anstar.movie.domain.entity.Movie;

@Component
public class MovieMapper implements Converter<Movie, CreateMovieDto> {

    @Override
    public Movie convert(CreateMovieDto createMovieDto) {
        return new Movie.Builder()
                .image(createMovieDto.getImage())
                .title(createMovieDto.getTitle())
                .year(createMovieDto.getYear())
                .videoId(createMovieDto.getVideoId())
                .build();
    }
}

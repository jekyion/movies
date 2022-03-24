package anstar.movie.domain.mapper;

import org.springframework.stereotype.Component;
import  anstar.movie.domain.dto.DetailsMovieDto;
import  anstar.movie.domain.entity.Movie;

@Component
public class MovieDetailsMapper implements Converter<DetailsMovieDto, Movie> {

    @Override
    public DetailsMovieDto convert(Movie movie) {
        return new DetailsMovieDto.Builder()
                .title(movie.getTitle())
                .videoId(movie.getVideoId())
                .image(movie.getImage())
                .year(movie.getYear())
                .build();
    }
}

package anstar.movie.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import  anstar.movie.domain.entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, CrudRepository<Movie, Long> {

    List<Movie> findByOrderByYearDesc();
    @Query("SELECT m FROM Movie m WHERE m.title LIKE %:search% ORDER BY m.year DESC")
    List<Movie> findByTitleLike(@Param("search") String search);

    @Query("SELECT COUNT(m) FROM Movie m WHERE m.title LIKE %:search%")
    Long countTitle(@Param("search") String search);

    @Modifying
    @Query("DELETE FROM Movie m WHERE m.movieId = :movieId")
    void deleteById(@Param("movieId") Long movieId);

    Movie findOneByMovieId(Long movieId);
}

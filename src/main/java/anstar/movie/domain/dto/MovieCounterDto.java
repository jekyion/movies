package anstar.movie.domain.dto;

public class MovieCounterDto {

    private long counter;

    private MovieCounterDto(Builder builder) {
        counter = builder.counter;
    }

    public long getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "MovieCounterDto{" +
                "counter=" + counter +
                '}';
    }

    public static final class Builder {
        private long counter;

        public Builder() {
        }

        public Builder counter(Long counter) {
            this.counter = counter;
            return this;
        }

        public MovieCounterDto build() {
            return new MovieCounterDto(this);
        }
    }
}

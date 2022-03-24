package anstar.movie.domain.dto;

public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;

    private DetailsMovieDto(Builder builder) {
        title = builder.title;
        image = builder.image;
        year = builder.year;
        videoId = builder.videoId;
    }

    DetailsMovieDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "DetailsMovieDto{" +
                "title='" + title + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }

    public static final class Builder {
        private String title;
        private String videoId;
        private String image;
        private Integer year;

        public Builder() {
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public DetailsMovieDto build() {
            return new DetailsMovieDto(this);
        }
    }
}

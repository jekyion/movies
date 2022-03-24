package anstar.movie.domain.dto;

public class UpdateMovieDto {
    private String title;
    private String image;
    private Integer year;
    private String videoId;

    private UpdateMovieDto(Builder builder) {
        title = builder.title;
        image = builder.image;
        year = builder.year;
        videoId = builder.videoId;
    }

    UpdateMovieDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    public String getVideoId() {
        return videoId;
    }

    @Override
    public String toString() {
        return "CreateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }

    public static final class Builder {
        private String title;
        private String image;
        private Integer year;
        private String videoId;

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

        public UpdateMovieDto build() {
            return new UpdateMovieDto(this);
        }
    }
}

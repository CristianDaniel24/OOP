package Streams.practice.practice3;

public class Movies {
    private String movieId;
    private String title;
    private Double rating;

    public Movies(String movieId, String title, Double rating) {
        this.movieId = movieId;
        this.title = title;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

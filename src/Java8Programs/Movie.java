package Java8Programs;

public class Movie {
    boolean starRated;
    String movieName;
    double rating;
    int releaseYear;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Movie(boolean starRated, String movieName, double rating, int releaseYear) {
        this.starRated = starRated;
        this.movieName = movieName;
        this.rating = rating;
        this.releaseYear=releaseYear;
    }

    public boolean isStarRated() {
        return starRated;
    }

    public void setStarRated(boolean starRated) {
        this.starRated = starRated;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getrating() {
        return rating;
    }

    public void setrating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "starRated=" + starRated +
                ", movieName='" + movieName + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

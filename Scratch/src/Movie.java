class Movie {
    // fields or instance variables --------------------------------------------
    // -------------------------------------------------------------------------
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;

    // constructors ------------------------------------------------------------
    // -------------------------------------------------------------------------
    public Movie() {
        // no-op
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue) {
        this(title);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
    }


    // business methods - pause(), play(), stop(), rewind(), fastForward() -----
    // -------------------------------------------------------------------------

    // accessor (get/set) methods - provide "controlled access" to the object fields
    // -------------------------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Movie: title=" + getTitle() +
                ", releaseYear=" + getReleaseYear() +
                ", revenue=" + getRevenue() +
                ", rating=" + getRating();
    }
}
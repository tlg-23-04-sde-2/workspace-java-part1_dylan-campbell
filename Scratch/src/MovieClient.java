class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        movie1.setReleaseYear(1997);
        movie1.setRevenue(750_000_000.0);

        System.out.println(movie1); // toString() automatically called
    }
}
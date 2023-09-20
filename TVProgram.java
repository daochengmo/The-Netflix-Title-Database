package project2;

public class TVProgram {
    private String type;
    private String title;
    private String director;
    private String country;
    private int releaseYear;
    private String rating;
    private int duration;
    private String genre;

    public TVProgram(String type, String title, String director, String country, int releaseYear, String rating, int duration, String genre) {
        this.type = type;
        this.title = title;
        this.director = director;
        this.country = country;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
    }

    public String getType() {
        return type;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public String toCSVLine() {
        String[] attributes = new String[] {
            type,
            title,
            director,
            country,
            Integer.toString(releaseYear),
            rating,
            duration + " min",
            genre
        };
        return String.join(",", attributes);
    }
}

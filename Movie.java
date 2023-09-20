package project2;

public class Movie extends TVProgram {
    public Movie(String type, String title, String genre, String country, int releaseYear, String rating, String directors, int duration) {
        super(type, title, directors, country, releaseYear, rating, duration, genre);
    }
        
    public String getTitle() {
        return super.getTitle();
    }

    public String getDirectors() {
        return super.getDirector();
    }

    public String getCountry() {
        return super.getCountry();
    }

    public String getRating() {
        return super.getRating();
    }

    public int getReleaseYear() {
        return super.getReleaseYear();
    }

    public int getDuration() {
        return super.getDuration();
    }

    public String getGenre() {
        return super.getGenre();
    }

    public void writeOutput(){
        System.out.println("Here is the created Movie");
        System.out.println("Movie Title: " + getTitle());
        System.out.println("Movie Director: " + getDirectors());
        System.out.println("Movie Country: " + getCountry());
        System.out.println("Movie Release year: " + getReleaseYear());
        System.out.println("Movie Rating: " + getRating());
        System.out.println("Movie Duration: " + getDuration());
        System.out.println("Movie Genre: " + getGenre());
    }
}

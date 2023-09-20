package project2;

public class TVShow extends TVProgram {
    public TVShow(String title, String country, int releaseYear, String rating, String director, int duration, String genre) {
        super("TV Show", title, director, country, releaseYear, rating, duration, genre);
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getDirector() {
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
        System.out.println("Here is the created TV Show");
        System.out.println("TV Show Title: " + getTitle());
        System.out.println("TV Show Director: " + getDirector());
        System.out.println("TV Show Country: " + getCountry());
        System.out.println("TV Show Release year: " + getReleaseYear());
        System.out.println("TV Show Rating: " + getRating());
        System.out.println("TV Show Duration: " + getDuration());
        System.out.println("TV Show Genre: " + getGenre());

    }
}

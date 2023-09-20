package project2;

    public abstract class Title {
        private String title;
        private String genre;
        private String description;
        private int releaseYear;
        private String rating;
    
        public Title(String title, String genre, String description, int releaseYear, String rating) {
            this.title = title;
            this.genre = genre;
            this.description = description;
            this.releaseYear = releaseYear;
            this.rating = rating;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getGenre() {
            return genre;
        }
    
        public void setGenre(String genre) {
            this.genre = genre;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public int getReleaseYear() {
            return releaseYear;
        }
    
        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }
    
        public String getRating() {
            return rating;
        }
    
        public void setRating(String rating) {
            this.rating = rating;
        }
    
        public abstract String toString();
    }


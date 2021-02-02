package ordinariais2.model;

import java.util.List;
import ordinariais2.Catalog;
import ordinariais2.Iterator;

public class Film{
    private final Image cover;
    private final String title;
    private final int year;
    private final String director;
    private List<String> actors;
    private final Genre genre;
    private final int score;
    private final int length;
    private int views = 0;

    public Film(Image cover, String title, int year, String director, Genre genre, int score, int length, List<String> actors) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre.addFilm(this);
        this.score = score;
        this.length = length;
        this.actors = actors;
    }

    public Image getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getScore() {
        return score;
    }

    public int getLength() {
        return length;
    }

    public int getViews() {
        return views;
    }
    
    
    
}

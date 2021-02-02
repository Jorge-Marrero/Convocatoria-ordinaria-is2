package ordinariais2.model;

import java.util.ArrayList;
import java.util.List;
import ordinariais2.Catalog;
import ordinariais2.Iterator;

public class Genre implements Catalog{
    private final String name;
    private List<Film> films = new ArrayList<>();

    public Genre(String name) {
        this.name = name;
    }
    
    public Genre addFilm(Film f){
        films.add(f);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<Film> getFilms() {
        return films;
    }

    @Override
    public Iterator createIterator() {
        return new FilmIterator(films);
    }
}

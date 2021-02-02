package ordinariais2.model;

import java.util.List;
import ordinariais2.Catalog;
import ordinariais2.Iterator;

public class FilmList implements Catalog{
    private List<Film> filmList;

    public FilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    @Override
    public Iterator createIterator() {
        return new FilmIterator(filmList);
    }
}

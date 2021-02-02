package ordinariais2.model;

import java.util.List;
import ordinariais2.Iterator;

public class FilmIterator implements Iterator{
    List<Film> films;
    int position = 0;

    public FilmIterator(List<Film> films) {
        this.films = films;
    }

    @Override
    public boolean hasNext() {
        return (position >= films.size()) ? false : true;        
    }

    @Override
    public Object next() {
        Film f = films.get(position);
        position++;
        return f;
    }
}

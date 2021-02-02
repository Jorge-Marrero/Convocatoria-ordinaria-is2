package ordinariais2.model;

import java.util.List;
import ordinariais2.Iterator;

public class GenreIterator implements Iterator{
    int position = 0;
    List<Genre> genres;

    public GenreIterator(List<Genre> genres) {
        this.genres = genres;
    }
    
    @Override
    public boolean hasNext() {
        return (position >= genres.size()) ? false : true;
    }

    @Override
    public Object next() {
        Genre f = genres.get(position);
        position++;
        return f;
    }
}

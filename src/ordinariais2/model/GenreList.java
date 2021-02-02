package ordinariais2.model;

import java.util.List;
import ordinariais2.Catalog;
import ordinariais2.Iterator;

public class GenreList implements Catalog{
    private List<Genre> genres;

    public GenreList(List<Genre> genres) {
        this.genres = genres;
    }
    
    @Override
    public Iterator createIterator() {
        return new GenreIterator(genres); 
    }  
}

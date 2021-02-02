package ordinariais2;

import java.util.ArrayList;
import java.util.List;
import ordinariais2.model.Film;
import ordinariais2.model.FilmList;
import ordinariais2.model.Genre;
import ordinariais2.model.GenreList;

public class AppCatalog {
    private Iterator films;
    private Iterator genre;
    private Catalog filmCatalog;
    private Catalog genreCatalog;

    public AppCatalog(List<Genre> g, List<Film> f) {
        filmCatalog = new FilmList(f);
        genreCatalog = new GenreList(g);
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
    }
    
    public void orderByMoreViews(){
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
        List<Film> order = new ArrayList<>();
        Film f1;
        Film f2;
        while(films.hasNext()){
           order.add((Film) films.next());
        }
        for(int i = 0; i < order.size(); i++){
            for(int j = i+1; j < order.size(); j++){
                f1 = order.get(i);
                f2 = order.get(j);
                if(f1.getScore() < f2.getScore()){
                    order.remove(f1);
                    order.remove(f2);
                    order.add(i, f2);
                    order.add(j, f1);
                }
            }
        }
        for(Film f : order){
            System.out.println(f.getTitle());
        }
    }
    
    public void orderByBest(){
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
        List<Film> order = new ArrayList<>();
        Film f1;
        Film f2;
        while(films.hasNext()){
            order.add((Film) films.next());
        }
        for(int i = 0; i < order.size(); i++){
            for(int j = i+1; j < order.size(); j++){
                f1 = order.get(i);
                f2 = order.get(j);
                if(f1.getScore() < f2.getScore()){
                    order.remove(f1);
                    order.remove(f2);
                    order.add(i, f2);
                    order.add(j, f1);
                }
            }
        }
        for(Film f : order){
            System.out.println(f.getTitle());
        }
    }
    
    public void orderbyGenre(){
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
        while(genre.hasNext()){
            Genre g = (Genre) genre.next();
            System.out.println(g.getName());
            Iterator filmGenre = g.createIterator();
            while(filmGenre.hasNext()){
                Film f = (Film) filmGenre.next();
                System.out.println(f.getTitle());
            }
        }
    }      
    
    public void orderByNew(int year){
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
        List<Film>order = new ArrayList<>();
        while (films.hasNext()){
            Film f = (Film) films.next();
            if(f.getYear() > year){
                order.add(f);
            }
        }
        for(Film f : order){
            System.out.println(f.getTitle());
        }
    }
    
    public void getFilm(Film f){
        this.films = filmCatalog.createIterator();
        this.genre = genreCatalog.createIterator();
        while(films.hasNext()){
            if(((Film)films.next()).equals(f)){
                System.out.println(f.getTitle());
                return;
            }
        }
        System.out.println("La pelicula deseada no se encuentra en el catalogo");
    }
}

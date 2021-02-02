package ordinariais2;

import java.util.ArrayList;
import java.util.List;
import ordinariais2.model.Film;
import ordinariais2.model.Genre;
import ordinariais2.model.Image;

public class OrdinariaIs2 {

    public static void main(String[] args) {
        Genre g1 = new Genre("Comedia");
        Genre g2 = new Genre("Terror");
        Image mock = new Image("Mock");
        List<String> actores = new ArrayList<>();
        actores.add("Antonio Banderas");
        Film f1 = new Film(mock, "Comedia_1", 2019, "Kubrick", g1, 9, 120, actores);
        Film f2 = new Film(mock, "Comedia_2", 2014, "Kubrick", g1, 6, 120, actores);
        Film f3 = new Film(mock, "Terror_1", 2021, "Kubrick", g2, 10, 120, actores);
        Film f4 = new Film(mock, "Terror_2", 2001, "Kubrick", g2, 3, 120, actores);
        
        List<Genre> genres = new ArrayList<>();
        List<Film> films = new ArrayList<>();
        genres.add(g1);
        genres.add(g2);
        films.add(f1);
        films.add(f2);
        films.add(f3);
        films.add(f4);
        
        AppCatalog app = new AppCatalog(genres, films);
        System.out.println("Por genero:");
        app.orderbyGenre();
        System.out.println("\nPor año");
        app.orderByNew(2018);
        System.out.println("\nPor puntuación");
        app.orderByBest();
        System.out.println("\nPor vistas");
        app.orderByMoreViews();
        System.out.println("\nEscoger Pelicula");
        app.getFilm(f4);
        app.getFilm(new Film(mock, "Terror_4", 2031, "Kubrick", g2, 3, 120, actores));
    }
    
}

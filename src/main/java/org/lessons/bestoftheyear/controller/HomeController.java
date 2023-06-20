package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller // dice a Spring che questa classe è un Controller
@RequestMapping("/") // a quale rotta rispondono i metodi di questo Controller
public class HomeController<Movie> {

    @GetMapping() // risponde a richieste di tipo HTTP GET

    public String template(Model model){ // chiediamo a Spring di invocare questo metodo passandogli il Model
        String name = "Claudio";
        model.addAttribute("name", name);
        return "index"; // ritorno il nome del template index.html che si trova nella cartella resources/templates
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Quasi Amici"));
        movies.add(new Movie(2, "Il Miglio Verde"));
        movies.add(new Movie(3, "Se Mi Lasci Ti Cancello"));

        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Bohemian Rhapsody"));
        songs.add(new Song(2, "Coloratura"));
        songs.add(new Song(3, "Amazing Day"));

        return songs;
    }
}
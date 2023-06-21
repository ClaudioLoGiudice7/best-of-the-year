package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.lessons.bestoftheyear.Movie;
import org.lessons.bestoftheyear.Song;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String template(Model model){
        String name = "Claudio";
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovies();
        List<String> movieTitles = new ArrayList<>();
        for (Movie movie : movies) {
            movieTitles.add(movie.getTitle());
        }
        model.addAttribute("movieTitles", movieTitles);
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = getBestSongs();
        List<String> songTitles = new ArrayList<>();
        for (Song song : songs) {
            songTitles.add(song.getTitle());
        }
        model.addAttribute("songTitles", songTitles);
        return "songs";
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
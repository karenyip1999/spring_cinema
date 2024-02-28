package com.example.cinema.controllers;

import com.example.cinema.models.Movie;
import com.example.cinema.services.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<String> newMovie(@RequestBody Movie movie)
    {
        String reply = movieService.addMovie(movie);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    //Added from lab review
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies()
    {
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    //Added from lab review
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie>getMovieById(@PathVariable Long id)
    {
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}

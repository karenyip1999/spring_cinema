package com.example.cinema.controllers;

import com.example.cinema.models.Movie;
import com.example.cinema.services.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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












}

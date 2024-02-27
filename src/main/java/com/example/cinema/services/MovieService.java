package com.example.cinema.services;

import com.example.cinema.models.Movie;
import com.example.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService() {

    }

    public String addMovie(Movie movie) {
        movieRepository.save(movie);
        return "This movie " + movie.getTitle() + " has been added to the database.";
    }

}

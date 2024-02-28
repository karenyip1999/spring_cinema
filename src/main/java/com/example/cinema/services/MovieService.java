package com.example.cinema.services;

import com.example.cinema.models.Movie;
import com.example.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService() {

    }

    public String addMovie(Movie movie) {
        movieRepository.save(movie);
        return "The movie " + movie.getTitle() + " has been added to the database.";
    }

    public List<Movie> getAllMovies()
    {
        return movieRepository.findAll();
    }

    public Movie getMovieById(long id)
    {
        return movieRepository.findById(id).get();
    }

}

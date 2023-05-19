package com.andreadiazcorreia.movies.services;

import com.andreadiazcorreia.movies.models.Movie;
import com.andreadiazcorreia.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public Optional<Movie> findMovieByImbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}

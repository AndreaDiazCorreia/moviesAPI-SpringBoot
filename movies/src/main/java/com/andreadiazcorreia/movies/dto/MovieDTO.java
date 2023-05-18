package com.andreadiazcorreia.movies.dto;

import com.andreadiazcorreia.movies.entities.Review;
import lombok.*;

import java.util.List;
@Getter
@Setter
public class MovieDTO {
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    private List<Review> reviews;
}

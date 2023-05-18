package com.andreadiazcorreia.movies.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
public class ReviewDTO {
    private String body;
    private LocalDateTime created;
    private LocalDateTime updates;
}

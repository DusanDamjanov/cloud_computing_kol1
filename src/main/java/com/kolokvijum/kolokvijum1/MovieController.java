package com.kolokvijum.kolokvijum1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;
import java.util.List;

@Controller
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired MovieRepository movieRepository;

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        Movie resp =  movieRepository.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(resp);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> resp = movieRepository.findAll();
        return ResponseEntity.status(HttpStatus.FOUND).body(resp);
    }

}

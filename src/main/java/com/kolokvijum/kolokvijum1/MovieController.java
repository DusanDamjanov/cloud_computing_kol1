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
@RequestMapping("localhost:/lalalal")   //todo: bice ovo da se izmeni...vrv neka konfiguracija treba da mu prosledi iz image?
public class MovieController {
    @Autowired MovieRepository movieRepository;

    @PostMapping(value = "/createMovie", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Movie addMovie(@RequestBody Movie movie){
        return  movieRepository.save(movie);
    }

    @GetMapping("getMovies")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}

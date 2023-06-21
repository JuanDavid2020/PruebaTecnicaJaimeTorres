package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.artistas;
import com.example.demo.services.artistasService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class artistasControlleres {

    @Autowired
    private artistasService artistasController;

    @GetMapping("/GetAllartistas")
    @ResponseStatus(HttpStatus.OK)
    public List<artistas> GetAllartistas() {
        return artistasController.GetAllartistas();
    }

    @GetMapping("/GetAllartistas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<artistas> GetartistasDetails(@PathVariable("id") Integer id) {
        return artistasController.GetartistasDetails(id);
    }

    @PostMapping("/Insertartistas")
    @ResponseStatus(HttpStatus.OK)
    public artistas Insertartistas(@RequestBody artistas artista) {
        return artistasController.Insertartistas(artista);
    }

    @DeleteMapping("/Deleteartistas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Insertartistas(@PathVariable("id") Integer id) {
        return artistasController.Deleteartistas(id);
    }

    @PutMapping("/Updateartistas")
    @ResponseStatus(HttpStatus.OK)
    public String Updateartistas(@RequestBody artistas artista) {
        return artistasController.Updateartistas(artista);
    }

}

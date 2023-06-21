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

import com.example.demo.Model.museos;
import com.example.demo.services.museosService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class museosControlleres {

    @Autowired
    private museosService museosController;

    @GetMapping("/GetAllmuseos")
    @ResponseStatus(HttpStatus.OK)
    public List<museos> GetAllmuseos() {
        return museosController.GetAllmuseos();
    }

    @GetMapping("/GetAllmuseos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<museos> GetmuseosDetails(@PathVariable("id") Integer id) {
        return museosController.GetmuseosDetails(id);
    }

    @PostMapping("/Insertmuseos")
    @ResponseStatus(HttpStatus.OK)
    public museos Insertmuseos(@RequestBody museos museo) {
        return museosController.Insertmuseos(museo);
    }

    @DeleteMapping("/Deletemuseos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Insertmuseos(@PathVariable("id") Integer id) {
        return museosController.Deletemuseos(id);
    }

    @PutMapping("/Updatemuseos")
    @ResponseStatus(HttpStatus.OK)
    public String Updatemuseos(@RequestBody museos museo) {
        return museosController.Updatemuseos(museo);
    }

    @GetMapping("/museos/buscarmuseos_alfabeticamente/{letra}")
    @ResponseStatus(HttpStatus.OK)
    public String BuscarMuseo(@PathVariable String letra) {
        return museosController.BuscarMuseo(letra);
    }

}

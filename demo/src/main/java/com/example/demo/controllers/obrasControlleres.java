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

import com.example.demo.Model.obras;
import com.example.demo.services.obrasService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class obrasControlleres {

    @Autowired
    private obrasService obrasController;

    @GetMapping("/GetAllobras")
    @ResponseStatus(HttpStatus.OK)
    public List<obras> GetAllobras() {
        return obrasController.GetAllobras();
    }

    @GetMapping("/GetAllobras/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<obras> GetobrasDetails(@PathVariable("id") Integer id) {
        return obrasController.GetobrasDetails(id);
    }

    @PostMapping("/Insertobras")
    @ResponseStatus(HttpStatus.OK)
    public obras Insertobras(@RequestBody obras obra) {
        return obrasController.Insertobras(obra);
    }

    @DeleteMapping("/Deleteobras/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Insertobras(@PathVariable("id") Integer id) {
        return obrasController.Deleteobras(id);
    }

    @PutMapping("/Updateobras")
    @ResponseStatus(HttpStatus.OK)
    public String Updateobras(@RequestBody obras obra) {
        return obrasController.Updateobras(obra);
    }

    @GetMapping("/obras/buscarObrasPorPais/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String buscarObrasPorPais(@PathVariable Integer id) {
        return obrasController.buscarObrasPorPais(id);
    }

}

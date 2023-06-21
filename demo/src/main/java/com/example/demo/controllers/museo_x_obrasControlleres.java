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

import com.example.demo.Model.museo_x_obras;
import com.example.demo.services.museo_x_obrasServices;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class museo_x_obrasControlleres {

    @Autowired
    private museo_x_obrasServices museo_x_obrasController;

    @GetMapping("/GetAllmuseo_x_obras")
    @ResponseStatus(HttpStatus.OK)
    public List<museo_x_obras> GetAllmuseo_x_obras() {
        return museo_x_obrasController.GetAllmuseo_x_obras();
    }

    @GetMapping("/GetAllmuseo_x_obras/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<museo_x_obras> Getmuseo_x_obrasDetails(@PathVariable("id") Integer id) {
        return museo_x_obrasController.Getmuseo_x_obrasDetails(id);
    }

    @PostMapping("/Insertmuseo_x_obras")
    @ResponseStatus(HttpStatus.OK)
    public museo_x_obras Insertmuseo_x_obras(@RequestBody museo_x_obras museo) {
        return museo_x_obrasController.Insertmuseo_x_obras(museo);
    }

    @DeleteMapping("/Deletemuseo_x_obras/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Insertmuseo_x_obras(@PathVariable("id") Integer id) {
        return museo_x_obrasController.Deletemuseo_x_obras(id);
    }

    @PutMapping("/Updatemuseo_x_obras")
    @ResponseStatus(HttpStatus.OK)
    public String Updatemuseo_x_obras(@RequestBody museo_x_obras museo) {
        return museo_x_obrasController.Updatemuseo_x_obras(museo);
    }

}

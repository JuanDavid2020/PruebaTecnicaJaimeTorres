package com.example.demo.services;

import com.example.demo.Repository.artistasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.artistas;

@Service
public class artistasService {

    @Autowired
    private artistasRepository artistasservices;

    public List<artistas> GetAllartistas() {
        return artistasservices.GetAllartistas();
    }

    public Optional<artistas> GetartistasDetails(Integer id) {
        return artistasservices.GetartistasDetails(id);
    }

    public artistas Insertartistas(artistas artista) {

        if (!artista.getConsole().isEmpty()) {
            return artistasservices.Insertartistas(artista);
        }
        return artista;
    }

    public String Deleteartistas(Integer id) {

        Optional<artistas> discount = artistasservices.GetartistasDetails(id);
        if (!discount.isEmpty()) {
            artistasservices.Deleteartistas(id);
            return "Registro Eliminado";
        }

        return "Registro No encontrado";
    }

    public String Updateartistas(artistas artista) {

        Optional<artistas> artistas1 = artistasservices.GetartistasDetails(artista.getID_SERIAL());
        if (!artistas1.isEmpty()) {
            artistasservices.Updateartistas(artista);
            return "Registro Actualizado";
        }

        return "Registro No encontrado";
    }
}
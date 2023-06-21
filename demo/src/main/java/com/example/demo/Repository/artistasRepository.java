package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Interface.artistasInterface;
import com.example.demo.Model.artistas;

@Repository
public class artistasRepository {

    @Autowired
    private artistasInterface artistasCRUD;

    public List<artistas> GetAllartistas() {
        return (List<artistas>) artistasCRUD.findAll();
    }

    public Optional<artistas> GetartistasDetails(Integer id) {
        return artistasCRUD.findById(id);
    }

    public artistas Insertartistas(artistas discount) {
        return artistasCRUD.save(discount);
    }

    public artistas Updateartistas(artistas discount) {
        return artistasCRUD.save(discount);
    }

    public void Deleteartistas(Integer id) {
        artistasCRUD.deleteById(id);
    }

}

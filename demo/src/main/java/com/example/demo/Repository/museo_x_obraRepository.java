package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Interface.museo_x_obrasInterface;
import com.example.demo.Model.museo_x_obras;

@Repository
public class museo_x_obraRepository {

    @Autowired
    private museo_x_obrasInterface museo_x_obrasCRUD;

    public List<museo_x_obras> GetAllmuseo_x_obras() {
        return (List<museo_x_obras>) museo_x_obrasCRUD.findAll();
    }

    public Optional<museo_x_obras> Getmuseo_x_obraDetails(Integer id) {
        return museo_x_obrasCRUD.findById(id);
    }

    public museo_x_obras Insertmuseo_x_obra(museo_x_obras museoobra) {
        return museo_x_obrasCRUD.save(museoobra);
    }

    public museo_x_obras Updatemuseo_x_obra(museo_x_obras museoobra) {
        return museo_x_obrasCRUD.save(museoobra);
    }

    public void Deletemuseo_x_obra(Integer id) {
        museo_x_obrasCRUD.deleteById(id);
    }
}

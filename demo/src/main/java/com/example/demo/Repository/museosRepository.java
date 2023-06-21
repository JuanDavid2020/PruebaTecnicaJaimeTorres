package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Interface.museosInterface;
import com.example.demo.Model.museos;

@Repository
public class museosRepository {

    @Autowired
    private museosInterface museosCRUD;

    public List<museos> GetAllmuseos() {
        return (List<museos>) museosCRUD.findAll();
    }

    public Optional<museos> GetmuseosDetails(Integer id) {
        return museosCRUD.findById(id);
    }

    public museos Insertmuseos(museos discount) {
        return museosCRUD.save(discount);
    }

    public museos Updatemuseos(museos discount) {
        return museosCRUD.save(discount);
    }

    public void Deletemuseos(Integer id) {
        museosCRUD.deleteById(id);
    }

    public String BuscarMuseo(String letra) {
        return museosCRUD.BuscarMuseo(letra);
    }
}

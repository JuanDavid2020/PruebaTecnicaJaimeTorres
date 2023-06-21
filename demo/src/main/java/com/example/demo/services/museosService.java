package com.example.demo.services;

import com.example.demo.Repository.museosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.museos;

@Service
public class museosService {

    @Autowired
    private museosRepository museosservices;

    public List<museos> GetAllmuseos() {
        return museosservices.GetAllmuseos();
    }

    public Optional<museos> GetmuseosDetails(Integer id) {
        return museosservices.GetmuseosDetails(id);
    }

    public museos Insertmuseos(museos museo) {

        if (!museo.getConsole().isEmpty()) {
            return museosservices.Insertmuseos(museo);
        }
        return museo;
    }

    public String Deletemuseos(Integer id) {

        Optional<museos> discount = museosservices.GetmuseosDetails(id);
        if (!discount.isEmpty()) {
            museosservices.Deletemuseos(id);
            return "Registro Eliminado";
        }

        return "Registro No encontrado";
    }

    public String Updatemuseos(museos museo) {

        Optional<museos> museos1 = museosservices.GetmuseosDetails(museo.getID_SERIAL());
        if (!museos1.isEmpty()) {
            museosservices.Updatemuseos(museo);
            return "Registro Actualizado";
        }

        return "Registro No encontrado";
    }

    public String BuscarMuseo(String letra) {
        return museosservices.BuscarMuseo(letra);
    }
}

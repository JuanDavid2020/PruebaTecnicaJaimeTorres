package com.example.demo.services;

import com.example.demo.Repository.museo_x_obraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.museo_x_obras;

@Service
public class museo_x_obrasServices {

    @Autowired
    private museo_x_obraRepository museo_x_obrasservices;

    public List<museo_x_obras> GetAllmuseo_x_obras() {
        return museo_x_obrasservices.GetAllmuseo_x_obras();
    }

    public Optional<museo_x_obras> Getmuseo_x_obrasDetails(Integer id) {
        return museo_x_obrasservices.Getmuseo_x_obraDetails(id);
    }

    public museo_x_obras Insertmuseo_x_obras(museo_x_obras museo) {

        if (!museo.getConsole().isEmpty()) {
            return museo_x_obrasservices.Insertmuseo_x_obra(museo);
        }
        return museo;
    }

    public String Deletemuseo_x_obras(Integer id) {

        Optional<museo_x_obras> discount = museo_x_obrasservices.Getmuseo_x_obraDetails(id);
        if (!discount.isEmpty()) {
            museo_x_obrasservices.Deletemuseo_x_obra(id);
            return "Registro Eliminado";
        }

        return "Registro No encontrado";
    }

    public String Updatemuseo_x_obras(museo_x_obras museo) {

        Optional<museo_x_obras> museo_x_obras1 = museo_x_obrasservices.Getmuseo_x_obraDetails(museo.getID_MUSEO());
        if (!museo_x_obras1.isEmpty()) {
            museo_x_obrasservices.Updatemuseo_x_obra(museo);
            return "Registro Actualizado";
        }

        return "Registro No encontrado";
    }

}

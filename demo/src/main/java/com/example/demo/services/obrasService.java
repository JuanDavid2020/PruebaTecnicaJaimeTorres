package com.example.demo.services;

import com.example.demo.Repository.obrasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.obras;

@Service
public class obrasService {

    @Autowired
    private obrasRepository obrasservices;

    public List<obras> GetAllobras() {
        return obrasservices.GetAllobras();
    }

    public Optional<obras> GetobrasDetails(Integer id) {
        return obrasservices.GetobrasDetails(id);
    }

    public obras Insertobras(obras obra) {

        if (!obra.getConsole().isEmpty()) {
            return obrasservices.Insertobras(obra);
        }
        return obra;
    }

    public String Deleteobras(Integer id) {

        Optional<obras> discount = obrasservices.GetobrasDetails(id);
        if (!discount.isEmpty()) {
            obrasservices.Deleteobras(id);
            return "Registro Eliminado";
        }

        return "Registro No encontrado";
    }

    public String Updateobras(obras obra) {

        Optional<obras> obras1 = obrasservices.GetobrasDetails(obra.getID_SERIAL());
        if (!obras1.isEmpty()) {
            obrasservices.Updateobras(obra);
            return "Registro Actualizado";
        }

        return "Registro No encontrado";

    }

    public String buscarObrasPorPais(Integer id) {
        return obrasservices.busquedaporpais(id);
    }
}
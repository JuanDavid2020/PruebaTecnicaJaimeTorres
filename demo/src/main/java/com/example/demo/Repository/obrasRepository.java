package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Interface.obrasInterface;
import com.example.demo.Model.obras;

@Repository
public class obrasRepository {

    @Autowired
    private obrasInterface obrasCRUD;

    public List<obras> GetAllobras() {
        return (List<obras>) obrasCRUD.findAll();
    }

    public Optional<obras> GetobrasDetails(Integer id) {
        return obrasCRUD.findById(id);
    }

    public obras Insertobras(obras discount) {
        return obrasCRUD.save(discount);
    }

    public obras Updateobras(obras discount) {
        return obrasCRUD.save(discount);
    }

    public void Deleteobras(Integer id) {
        obrasCRUD.deleteById(id);
    }

    public String busquedaporpais(Integer id) {
        return obrasCRUD.busquedaporpais(id);
    }

}

package com.example.demo.Interface;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.obras;

public interface obrasInterface extends CrudRepository<obras, Integer> {

    @Query(value = "SELECT b.ID_SERIAL,b.NOMBRE,b.PAIS,b.ID_ARTISTA FROM pruebatecnicaapi.artistas a ,pruebatecnicaapi.obras b where a.ID_SERIAL=b.ID_ARTISTA and a.ID_SERIAL=101 and b.PAIS='COLOMBIA'", nativeQuery = true)
    String busquedaporpais(Integer id);

}

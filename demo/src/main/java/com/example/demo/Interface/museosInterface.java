package com.example.demo.Interface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.museos;

public interface museosInterface extends CrudRepository<museos, Integer> {

    @Query(value = "SELECT * FROM pruebatecnicaapi.museos WHERE NOMBRE LIKE 'L%'", nativeQuery = true)
    String BuscarMuseo(String letra);

}

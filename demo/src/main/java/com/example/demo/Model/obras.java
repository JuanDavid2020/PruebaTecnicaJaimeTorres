package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obras")

public class obras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_SERIAL;

    private String NOMBRE;

    private String PAIS;

    private Integer ID_ARTISTA;

    private String Console;

    public String getConsole() {
        return Console;
    }

    public void setConsole(String console) {
        Console = console;
    }

    public Integer getID_SERIAL() {
        return ID_SERIAL;
    }

    public void setID_SERIAL(int id) {
        ID_SERIAL = id;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String name) {
        NOMBRE = name;
    }

    public String getPAIS() {
        return PAIS;
    }

    public void setPAIS(String country) {
        PAIS = country;
    }

    public Integer getID_ARTISTA() {
        return ID_ARTISTA;
    }

    public void setID_ARTISTA(int id_artista) {
        ID_ARTISTA = id_artista;
    }

}

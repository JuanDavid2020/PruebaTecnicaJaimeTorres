package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artistas")
public class artistas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_SERIAL;

    private String TIPO_IDE;

    private String NOMBRES;

    private String APELLIDOS;

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

    public String getTIPO_IDE() {
        return TIPO_IDE;
    }

    public void setTIPO_IDE(String ide) {
        TIPO_IDE = ide;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String nombre) {
        NOMBRES = nombre;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String apellido) {
        APELLIDOS = apellido;
    }

}

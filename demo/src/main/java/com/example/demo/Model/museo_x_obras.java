package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "museos_x_obras")

public class museo_x_obras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_MUSEO;

    private Integer ID_OBRA;

    private String Console;

    public String getConsole() {
        return Console;
    }

    public void setConsole(String console) {
        Console = console;
    }

    public Integer getID_MUSEO() {
        return ID_MUSEO;
    }

    public void setID_MUSEO(int id) {
        ID_MUSEO = id;
    }

    public Integer getID_ID_OBRA() {
        return ID_OBRA;
    }

    public void setID_OBRA(int id_obra) {
        ID_OBRA = id_obra;
    }
}

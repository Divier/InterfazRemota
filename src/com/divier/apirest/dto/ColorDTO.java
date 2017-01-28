package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "colorDTO")
public class ColorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idColor;
    private String nombre;

    public Integer getIdColor() {
        return this.idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
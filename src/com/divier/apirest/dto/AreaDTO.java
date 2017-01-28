package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "areaDTO")
public class AreaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idArea;
    private String codArea;
    private String nombre;
    private CiudadDTO idCiudad;

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CiudadDTO getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(CiudadDTO idCiudad) {
        this.idCiudad = idCiudad;
    }
}
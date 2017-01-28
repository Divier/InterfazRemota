package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "estadoActivoDTO")
public class EstadoActivoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idEstadoActivo;
    private String nombre;

    public Integer getIdEstadoActivo() {
        return idEstadoActivo;
    }

    public void setIdEstadoActivo(Integer idEstadoActivo) {
        this.idEstadoActivo = idEstadoActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
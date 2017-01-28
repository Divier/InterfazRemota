package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "tipoActivoDTO")
public class TipoActivoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idTipoActivo;
    private String nombre;

    public Integer getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(Integer idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
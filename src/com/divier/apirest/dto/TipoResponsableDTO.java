package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "tipoResponsableDTO")
public class TipoResponsableDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idTipoResponsable;
    private String nombre;

    public Integer getIdTipoResponsable() {
        return idTipoResponsable;
    }

    public void setIdTipoResponsable(Integer idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
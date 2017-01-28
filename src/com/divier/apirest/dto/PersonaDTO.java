package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "personaDTO")
public class PersonaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idPersona;
    private String numIdentificacion;
    private String nombre;
    private TipoIdentificacionDTO idTipoIdentificacion;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoIdentificacionDTO getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacionDTO idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
}
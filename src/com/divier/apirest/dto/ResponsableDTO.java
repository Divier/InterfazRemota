package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "responsableDTO")
public class ResponsableDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idResponsable;
    private AreaDTO idArea;
    private PersonaDTO idPersona;
    private TipoResponsableDTO idTipoResponsable;

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public AreaDTO getIdArea() {
        return idArea;
    }

    public void setIdArea(AreaDTO idArea) {
        this.idArea = idArea;
    }

    public PersonaDTO getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(PersonaDTO idPersona) {
        this.idPersona = idPersona;
    }

    public TipoResponsableDTO getIdTipoResponsable() {
        return idTipoResponsable;
    }

    public void setIdTipoResponsable(TipoResponsableDTO idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }  
}
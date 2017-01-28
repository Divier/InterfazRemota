package com.divier.apirest.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "respuestaDTO")
public class RespuestaDTO implements Serializable {

    private String mensaje;

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
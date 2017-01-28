package com.divier.apirest.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Divier
 */
@XmlRootElement(name = "activoDTO")
public class ActivoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idActivo;
    private String nombre;
    private String descripcion;
    private String serial;
    private Integer numIntInventario;
    private BigDecimal peso;
    private BigDecimal alto;
    private BigDecimal ancho;
    private BigDecimal largo;
    private BigDecimal valorCompra;
    private Date fechaCompra;
    private Date fechaBaja;
    private ColorDTO idColor;
    private EstadoActivoDTO idEstadoActivo;
    private ResponsableDTO idResponsable;
    private TipoActivoDTO idTipoActivo;

    public Integer getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getNumIntInventario() {
        return numIntInventario;
    }

    public void setNumIntInventario(Integer numIntInventario) {
        this.numIntInventario = numIntInventario;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public ColorDTO getIdColor() {
        return idColor;
    }

    public void setIdColor(ColorDTO idColor) {
        this.idColor = idColor;
    }

    public EstadoActivoDTO getIdEstadoActivo() {
        return idEstadoActivo;
    }

    public void setIdEstadoActivo(EstadoActivoDTO idEstadoActivo) {
        this.idEstadoActivo = idEstadoActivo;
    }

    public ResponsableDTO getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(ResponsableDTO idResponsable) {
        this.idResponsable = idResponsable;
    }

    public TipoActivoDTO getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(TipoActivoDTO idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }   
}
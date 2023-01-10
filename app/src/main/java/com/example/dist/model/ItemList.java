package com.example.dist.model;

import java.io.Serializable;

public class ItemList implements Serializable {
    private String pkProductos;
    private String prodNombre;
    private String prodCategoria;
    private String codigoProducto;
    private String presentacion;
    private String unidadMedida;
    private String contenido;
    private String peso;
    private String precioVenta;
    private String imgResource;
    private String prodPrecio;
    private String prodDetalles;

    public ItemList(String pkProductos, String prodNombre, String prodCategoria, String codigoProducto, String presentacion, String unidadMedida, String contenido, String peso, String precioVenta, String imgResource, String prodPrecio, String prodDetalles) {
        this.pkProductos = pkProductos;
        this.prodNombre = prodNombre;
        this.prodCategoria = prodCategoria;
        this.codigoProducto = codigoProducto;
        this.presentacion = presentacion;
        this.unidadMedida = unidadMedida;
        this.contenido = contenido;
        this.peso = peso;
        this.precioVenta = precioVenta;
        this.imgResource = imgResource;
        this.prodPrecio = prodPrecio;
        this.prodDetalles = prodDetalles;
    }

    public String getPkProductos() {
        return pkProductos;
    }

    public void setPkProductos(String pkProductos) {
        this.pkProductos = pkProductos;
    }

    public String getProdNombre() {
        return prodNombre;
    }

    public void setProdNombre(String prodNombre) {
        this.prodNombre = prodNombre;
    }

    public String getProdCategoria() {
        return prodCategoria;
    }

    public void setProdCategoria(String prodCategoria) {
        this.prodCategoria = prodCategoria;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getImgResource() {
        return imgResource;
    }

    public void setImgResource(String imgResource) {
        this.imgResource = imgResource;
    }

    public String getProdPrecio() {
        return prodPrecio;
    }

    public void setProdPrecio(String prodPrecio) {
        this.prodPrecio = prodPrecio;
    }

    public String getProdDetalles() {
        return prodDetalles;
    }

    public void setProdDetalles(String prodDetalles) {
        this.prodDetalles = prodDetalles;
    }

}
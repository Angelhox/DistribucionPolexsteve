package com.example.dist.model;

public class ItemListClientes {

    private String nombre;
    private String telefono;
    private String cedulaRuc;
    private String direccion;
    private String correo;
    private String idPersonaCliente;
    private String codigoCliente;
    private String usuarioCliente;
    private String claveCliente;
    private String imgResource;

    public ItemListClientes(String nombre, String telefono, String cedulaRuc, String direccion, String correo, String idPersonaCliente, String codigoCliente, String usuarioCliente, String claveCliente, String imgResource) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedulaRuc = cedulaRuc;
        this.direccion = direccion;
        this.correo = correo;
        this.idPersonaCliente = idPersonaCliente;
        this.codigoCliente = codigoCliente;
        this.usuarioCliente = usuarioCliente;
        this.claveCliente = claveCliente;
        this.imgResource = imgResource;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdPersonaCliente() {
        return idPersonaCliente;
    }

    public void setIdPersonaCliente(String idPersonaCliente) {
        this.idPersonaCliente = idPersonaCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getClaveCliente() {
        return claveCliente;
    }

    public void setClaveCliente(String claveCliente) {
        this.claveCliente = claveCliente;
    }

    public String getImgResource() {
        return imgResource;
    }

    public void setImgResource(String imgResource) {
        this.imgResource = imgResource;
    }


}

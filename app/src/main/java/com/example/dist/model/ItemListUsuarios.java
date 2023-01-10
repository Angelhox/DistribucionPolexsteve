package com.example.dist.model;

public class ItemListUsuarios {
    private String Nombre;
    private String telefono;
    private String CedulaRuc;
    private String Direccion;
    private String idPersonaUsuario;
    private String usuarioCodigo;
    private String usuarioFechaIngreso;
    private String usuarioFechaNacimiento;
    private String usuarioCargo;
    private String usuarioNombre;
    private String usuarioClave;
    private String correo;
    private String imgResource;


    public ItemListUsuarios(String Nombre, String telefono, String CedulaRuc, String Direccion, String idPersonaUsuario, String usuarioCodigo, String usuarioFechaIngreso, String usuarioFechaNacimiento, String usuarioCargo, String usuarioNombre, String usuarioClave, String correo, String imgResource) {
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.CedulaRuc = CedulaRuc;
        this.Direccion = Direccion;
        this.idPersonaUsuario = idPersonaUsuario;
        this.usuarioCodigo = usuarioCodigo;
        this.usuarioFechaIngreso = usuarioFechaIngreso;
        this.usuarioFechaNacimiento = usuarioFechaNacimiento;
        this.usuarioCargo = usuarioCargo;
        this.usuarioNombre = usuarioNombre;
        this.usuarioClave = usuarioClave;
        this.correo = correo;
        this.imgResource = imgResource;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulaRuc() {
        return CedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.CedulaRuc = cedulaRuc;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getIdPersonaUsuario() {
        return idPersonaUsuario;
    }

    public void setIdPersonaUsuario(String idPersonaUsuario) {
        this.idPersonaUsuario = idPersonaUsuario;
    }

    public String getUsuarioCodigo() {
        return usuarioCodigo;
    }

    public void setUsuarioCodigo(String usuarioCodigo) {
        this.usuarioCodigo = usuarioCodigo;
    }

    public String getUsuarioFechaIngreso() {
        return usuarioFechaIngreso;
    }

    public void setUsuarioFechaIngreso(String usuarioFechaIngreso) {
        this.usuarioFechaIngreso = usuarioFechaIngreso;
    }

    public String getUsuarioFechaNacimiento() {
        return usuarioFechaNacimiento;
    }

    public void setUsuarioFechaNacimiento(String usuarioFechaNacimiento) {
        this.usuarioFechaNacimiento = usuarioFechaNacimiento;
    }

    public String getUsuarioCargo() {
        return usuarioCargo;
    }

    public void setUsuarioCargo(String usuarioCargo) {
        this.usuarioCargo = usuarioCargo;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioClave() {
        return usuarioClave;
    }

    public void setUsuarioClave(String usuarioClave) {
        this.usuarioClave = usuarioClave;
    }

    public String getUsuarioCorreo() {
        return correo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.correo = usuarioCorreo;
    }

    public String getImgResource() {
        return imgResource;
    }

    public void setImgResource(String imgResource) {
        this.imgResource = imgResource;
    }
}

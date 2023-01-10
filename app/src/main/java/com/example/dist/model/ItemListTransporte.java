package com.example.dist.model;

public class ItemListTransporte {
    private String idTransporte;
    private String placa;
    private String tipoVehiculo;
    private String fechaAdquisicion;
    private String imgResource;

    public ItemListTransporte(String idTransporte, String placa, String tipoVehiculo, String fechaAdquisicion, String imgResource) {
        this.idTransporte = idTransporte;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.imgResource = imgResource;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getImgResource() {
        return imgResource;
    }

    public void setImgResource(String imgResource) {
        this.imgResource = imgResource;
    }
}

package com.example.app_delitos.domain;

public class Delito {

    private String id;
    private String userId;
    private String tipoDelitoId;
    private String fechaOcurrencia;
    private String latitud;
    private String longitud;

    public Delito() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTipoDelitoId() {
        return tipoDelitoId;
    }

    public void setTipoDelitoId(String tipoDelitoId) {
        this.tipoDelitoId = tipoDelitoId;
    }

    public String getFechaOcurrencia() {
        return fechaOcurrencia;
    }

    public void setFechaOcurrencia(String fechaOcurrencia) {
        this.fechaOcurrencia = fechaOcurrencia;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}

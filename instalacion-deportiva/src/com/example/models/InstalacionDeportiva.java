package com.example.models;

import com.example.enums.TipoRecinto;

public abstract class InstalacionDeportiva {
    private String nombreInstalacion;
    private TipoRecinto tipoRecinto;
    private double superficie;

    public InstalacionDeportiva(String nombreInstalacion, TipoRecinto tipoRecinto, double superficie) {
        this.nombreInstalacion = nombreInstalacion;
        this.tipoRecinto = tipoRecinto;
        this.superficie = superficie;
    }

    public String getNombreInstalacion() {
        return nombreInstalacion;
    }

    public void setNombreInstalacion(String nombreInstalacion) {
        this.nombreInstalacion = nombreInstalacion;
    }

    public TipoRecinto getTipoRecinto() {
        return tipoRecinto;
    }

    public void setTipoRecinto(TipoRecinto tipoRecinto) {
        this.tipoRecinto = tipoRecinto;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "InstalacionDeportiva{" +
                "nombreInstalacion='" + nombreInstalacion + '\'' +
                ", tipoRecinto=" + tipoRecinto +
                ", superficie=" + superficie +
                '}';
    }
}

package com.conversor.divisas.modelos;
import com.google.gson.annotations.SerializedName;

public class Conversor {

    @SerializedName("result")
    private String resultado;
    @SerializedName("documentation")
    private String documentacion;
    @SerializedName("terms_of_use")
    private String terminos;
    @SerializedName("time_last_update_unix")
    private String unixUltimaActualizacion;
    @SerializedName("time_last_update_utc")
    private String utcUltimaActualizacion;
    @SerializedName("time_next_update_unix")
    private String unixSiguienteActualizacion;
    @SerializedName("time_nex_update_utc")
    private String utcSiguienteActualizacion;
    @SerializedName("base_code")
    private String monedaEntrada;
    @SerializedName("target_code")
    private String monedaSalida;
    @SerializedName("conversion_rate")
    private double cantidadAConvertir;
    @SerializedName("conversion_result")
    private double cantidadResultado;

    public String getResultado() {
        return resultado;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public String getTerminos() {
        return terminos;
    }

    public String getUnixUltimaActualizacion() {
        return unixUltimaActualizacion;
    }

    public String getUtcUltimaActualizacion() {
        return utcUltimaActualizacion;
    }

    public String getUnixSiguienteActualizacion() {
        return unixSiguienteActualizacion;
    }

    public String getUtcSiguienteActualizacion() {
        return utcSiguienteActualizacion;
    }

    public String getMonedaEntrada() {
        return monedaEntrada;
    }

    public String getMonedaSalida() {
        return monedaSalida;
    }

    public double getCantidadAConvertir() {
        return cantidadAConvertir;
    }

    public double getCantidadResultado() {
        return cantidadResultado;
    }




}

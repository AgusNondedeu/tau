package edu.it.model;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

public class ClimaVehiculo {
    public String id;
    public TipoClima tipoClima;
    public DatosVehiculo datosVehiculo;

    public ClimaVehiculo() {
    }
    
    public ClimaVehiculo(String id, TipoClima tipoClima, DatosVehiculo datosVehiculo) {
        this.id = id;
        this.tipoClima = tipoClima;
        this.datosVehiculo = datosVehiculo;
    }
}

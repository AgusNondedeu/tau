package edu.it.service;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;
import edu.it.model.Ticket;
import edu.it.repository.GrabadorTicket;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class Evaluador {
    private GrabadorTicket grabadorTicket;

    public Evaluador(GrabadorTicket grabadorTicket) {
        this.grabadorTicket = grabadorTicket;
    }
    
    public void evaluar(TipoClima tc, DatosVehiculo dv) {
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 130) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 110) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Auto) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 80) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Camion) {
            if (dv.velocidadMedida <= 70) {
                return;
            }
        }
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 130) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 110) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Moto) {
            if (dv.velocidadMedida <= 90) {
                return;
            }
        }
        if (tc == TipoClima.NORMAL && dv.tipoVehiculo == TipoVehiculo.Tractor) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_MODERADAS && dv.tipoVehiculo == TipoVehiculo.Tractor) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }
        if (tc == TipoClima.LLUVIAS_TORRENCIALES && dv.tipoVehiculo == TipoVehiculo.Tractor) {
            if (dv.velocidadMedida <= 60) {
                return;
            }
        }

        var ticket = new Ticket(
                UUID.randomUUID().toString(),
                System.currentTimeMillis() / 1000,
                dv.patente,
                dv.tipoVehiculo.name(),
                dv.velocidadMedida,
                tc.name(),
                0
        );
        
        grabadorTicket.grabar(ticket);
    }
}

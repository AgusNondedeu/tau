package edu.it.model;

import com.bolivarsoft.sensorvelocidad.TipoVehiculo;
import javax.persistence.*;

@Entity
@Table(name="tickets")
public class Ticket {
    @Id
    @Column(name="id_ticket")
    public String idTicket;
    @Column(name="fecha_hora")
    public long fechaHora;
    public String patente;
    @Column(name="tipo_vehiculo")
    public String tipoVehiculo;
    @Column(name="velocidad_medida")
    public int velocidadMedida;
    @Column(name="tipo_clima")
    public String tipoClima;
    @Column(name="limite_permitido")
    public long limitePermitido;

    public Ticket(String idTicket, long fechaHora, String patente, String tipoVehiculo, int velocidadMedida, String tipoClima, long limitePermitido) {
        this.idTicket = idTicket;
        this.fechaHora = fechaHora;
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.velocidadMedida = velocidadMedida;
        this.tipoClima = tipoClima;
        this.limitePermitido = limitePermitido;
    }
    
    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", fechaHora=" + fechaHora + ", patente=" + patente + ", tipoVehiculo=" + tipoVehiculo + ", velocidadMedida=" + velocidadMedida + ", tipoClima=" + tipoClima + ", limitePermitido=" + limitePermitido + '}';
    }
}

package edu.it.repository;

import edu.it.model.Ticket;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
    public List<Ticket> findAllByOrderByFechaHora();
    public List<Ticket> findAllByTipoVehiculo(String tipo);
    public List<Ticket> findTop2ByOrderByVelocidadMedidaDesc();
    public List<Ticket> findTop5ByOrderByFechaHoraDesc();
}

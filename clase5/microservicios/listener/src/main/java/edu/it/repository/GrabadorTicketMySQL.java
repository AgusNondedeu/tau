package edu.it.repository;

import edu.it.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GrabadorTicketMySQL implements GrabadorTicket {
    
    @Autowired
    private TicketRepository ticketRepository;
    
    public void grabar(Ticket tkt) {
        System.out.println("Grabando ticket en MySQL");
        
        ticketRepository.save(tkt);
    }

}

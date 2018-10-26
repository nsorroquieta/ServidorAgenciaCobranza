import uy.com.antel.Ticket;
import uy.com.antel.TicketPersist;

import java.util.List;

public class listarTicketsBean {
    TicketPersist ticketPersist = new TicketPersist();
    List<Ticket> listaTickets = ticketPersist.loadTickets();

    public TicketPersist getTicketPersist() {
        return ticketPersist;
    }

    public void setTicketPersist(TicketPersist ticketPersist) {
        this.ticketPersist = ticketPersist;
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(List<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }

}

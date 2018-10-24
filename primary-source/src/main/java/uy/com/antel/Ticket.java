package uy.com.antel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {

    private String carRegistration;
    private Date startDate;
    private Date saleDate;
    private Integer minutes;

    /*
    private int ticketId;
    private Agencia agenciaCobranza;
    private Date salesDateTime = new Date();
    private Date startDateTime; //Falta indicar hora de comienzo
    private float totalPrice; //Esto debería pasarlo la intendencia.
    */

    public Ticket(String carRegistration, Date startDate, Integer minutes) {
        this.setCarRegistration(carRegistration);
        this.setStartDate(startDate);
        this.setMinutes(minutes);
        this.setSaleDate();
    }

    /*public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }*/

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate() {
        this.saleDate = new Date();
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

/*    public int getTicketId() {
        return ticketId;
    }

    private void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public Date getSalesDateTime() {
        return salesDateTime;
    }

    public void setSalesDateTime(Date salesDateTime) {
        this.salesDateTime = salesDateTime;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
        this.setStartDateTime(this.getDate(startDate));
    }


    private Date getDate(String fecha) {
        Date date1 = null;
        try {
            date1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }

    */
}

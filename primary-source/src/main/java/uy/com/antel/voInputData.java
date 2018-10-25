package uy.com.antel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class voInputData{

    private String command;


    private String ticketId;
    private String carRegistration;
    private String startDate;
    private String minutes;

    public voInputData(String command, String ticketId, String carRegistration, String inputStartDate, String minutes) {
        System.out.println("Command: " + command + "StartDate: " + inputStartDate + "carRegistration: " + carRegistration + "minutes: " + minutes);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

}

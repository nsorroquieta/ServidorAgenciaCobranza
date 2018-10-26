package uy.com.antel;

import java.sql.ResultSet;
import java.sql.SQLException;


public class QueriesAgency extends DbConnection {
    public QueriesAgency() {    }

    public int getAgencyByTicketId(int nroTicket){
        int agencia=0;
        try{
            //InitialContext initContext = new InitialContext();
            String query = "select agencyId from tickets where ticketId="+nroTicket +" ";
            conn = ds.getConnection();
            ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            if(rs.next())
            {
                agencia = rs.getInt("agencyId");
            }
            rs.close();
            ps.close();
            conn.close();

        }catch(Exception e){}

        return agencia;
    }

    public boolean anulaTicket(int ticketId){
        Boolean ok=false;

        try{
            conn = ds.getConnection();
            String query1 = "update tickets set Status='ANULADO' where ticketId="+ ticketId+ " ";
            ps = conn.prepareStatement(query1);
            ps.executeUpdate();
            ok=true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ok;
    }
}

package uy.com.antel;

public class connIMM {
    public static void main( String[] args )
    {
        WebServiceIMMService ws = new WebServiceIMMService();
        String response = ws.getWebServiceIMMPort().test("Texto de prueba");
        System.out.println(response);
        String salesResponse = ws.getWebServiceIMMPort().comprarTicket(5, "SBA 1020", "2018-10-11 22:47:00", "2018-10-11 22:50:00", 60);
        System.out.println(salesResponse);
    }
}

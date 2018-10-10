package uy.com.antel;

public class connIMM {
    public static void main( String[] args )
    {
        WebServiceIMMService ws = new WebServiceIMMService();
        String response = ws.getWebServiceIMMPort().test("Texto de prueba");
        System.out.println(response);
    }
}

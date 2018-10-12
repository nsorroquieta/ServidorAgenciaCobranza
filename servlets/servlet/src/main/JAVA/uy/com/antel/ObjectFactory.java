
package uy.com.antel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.com.antel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComprarTicket_QNAME = new QName("http://antel.com.uy/", "comprarTicket");
    private final static QName _Test_QNAME = new QName("http://antel.com.uy/", "test");
    private final static QName _ComprarTicketResponse_QNAME = new QName("http://antel.com.uy/", "comprarTicketResponse");
    private final static QName _TestResponse_QNAME = new QName("http://antel.com.uy/", "testResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.com.antel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprarTicket }
     * 
     */
    public ComprarTicket createComprarTicket() {
        return new ComprarTicket();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ComprarTicketResponse }
     * 
     */
    public ComprarTicketResponse createComprarTicketResponse() {
        return new ComprarTicketResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "comprarTicket")
    public JAXBElement<ComprarTicket> createComprarTicket(ComprarTicket value) {
        return new JAXBElement<ComprarTicket>(_ComprarTicket_QNAME, ComprarTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "comprarTicketResponse")
    public JAXBElement<ComprarTicketResponse> createComprarTicketResponse(ComprarTicketResponse value) {
        return new JAXBElement<ComprarTicketResponse>(_ComprarTicketResponse_QNAME, ComprarTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

}

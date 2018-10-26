
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

    private final static QName _CancellationRequest_QNAME = new QName("http://antel.com.uy/", "cancellationRequest");
    private final static QName _ComprarTicket_QNAME = new QName("http://antel.com.uy/", "comprarTicket");
    private final static QName _CancellationRequestResponse_QNAME = new QName("http://antel.com.uy/", "cancellationRequestResponse");
    private final static QName _ComprarTicketResponse_QNAME = new QName("http://antel.com.uy/", "comprarTicketResponse");
    private final static QName _CalcularCosto_QNAME = new QName("http://antel.com.uy/", "calcularCosto");
    private final static QName _CalcularCostoResponse_QNAME = new QName("http://antel.com.uy/", "calcularCostoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.com.antel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancellationRequestResponse }
     * 
     */
    public CancellationRequestResponse createCancellationRequestResponse() {
        return new CancellationRequestResponse();
    }

    /**
     * Create an instance of {@link CancellationRequest }
     * 
     */
    public CancellationRequest createCancellationRequest() {
        return new CancellationRequest();
    }

    /**
     * Create an instance of {@link ComprarTicket }
     * 
     */
    public ComprarTicket createComprarTicket() {
        return new ComprarTicket();
    }

    /**
     * Create an instance of {@link CalcularCosto }
     * 
     */
    public CalcularCosto createCalcularCosto() {
        return new CalcularCosto();
    }

    /**
     * Create an instance of {@link ComprarTicketResponse }
     * 
     */
    public ComprarTicketResponse createComprarTicketResponse() {
        return new ComprarTicketResponse();
    }

    /**
     * Create an instance of {@link CalcularCostoResponse }
     * 
     */
    public CalcularCostoResponse createCalcularCostoResponse() {
        return new CalcularCostoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "cancellationRequest")
    public JAXBElement<CancellationRequest> createCancellationRequest(CancellationRequest value) {
        return new JAXBElement<CancellationRequest>(_CancellationRequest_QNAME, CancellationRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "cancellationRequestResponse")
    public JAXBElement<CancellationRequestResponse> createCancellationRequestResponse(CancellationRequestResponse value) {
        return new JAXBElement<CancellationRequestResponse>(_CancellationRequestResponse_QNAME, CancellationRequestResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCosto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "calcularCosto")
    public JAXBElement<CalcularCosto> createCalcularCosto(CalcularCosto value) {
        return new JAXBElement<CalcularCosto>(_CalcularCosto_QNAME, CalcularCosto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCostoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://antel.com.uy/", name = "calcularCostoResponse")
    public JAXBElement<CalcularCostoResponse> createCalcularCostoResponse(CalcularCostoResponse value) {
        return new JAXBElement<CalcularCostoResponse>(_CalcularCostoResponse_QNAME, CalcularCostoResponse.class, null, value);
    }

}


package ihe.iti.rmd._2017;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ihe.iti.xds_b._2007.RetrieveDocumentSetRequestType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ihe.iti.rmd._2017 package. 
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

    private final static QName _RemoveDocumentsRequest_QNAME = new QName("urn:ihe:iti:rmd:2017", "RemoveDocumentsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ihe.iti.rmd._2017
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentSetRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentSetRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:iti:rmd:2017", name = "RemoveDocumentsRequest")
    public JAXBElement<RetrieveDocumentSetRequestType> createRemoveDocumentsRequest(RetrieveDocumentSetRequestType value) {
        return new JAXBElement<RetrieveDocumentSetRequestType>(_RemoveDocumentsRequest_QNAME, RetrieveDocumentSetRequestType.class, null, value);
    }

}

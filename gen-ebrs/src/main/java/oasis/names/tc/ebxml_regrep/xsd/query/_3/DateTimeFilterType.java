
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für DateTimeFilterType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DateTimeFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}SimpleFilterType"&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeFilterType")
public class DateTimeFilterType
    extends SimpleFilterType
{

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}

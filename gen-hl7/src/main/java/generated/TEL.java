
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A telephone number (voice or fax), e-mail address, or
 *             other locator for a resource (information or service)
 *             mediated by telecommunication equipment. The address
 *             is specified as a URL
 *             qualified by time specification and use codes that help
 *             in deciding which address to use for a given time and
 *             purpose.
 *          
 * 
 * <p>Java-Klasse für TEL complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TEL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}URL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useablePeriod" type="{}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{}set_TelecommunicationAddressUse" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEL", propOrder = {
    "useablePeriod"
})
public class TEL
    extends URL
{

    protected List<SXCMTS> useablePeriod;
    @XmlAttribute(name = "use")
    protected List<String> use;

    /**
     * Gets the value of the useablePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useablePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseablePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getUseablePeriod() {
        if (useablePeriod == null) {
            useablePeriod = new ArrayList<SXCMTS>();
        }
        return this.useablePeriod;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUse() {
        if (use == null) {
            use = new ArrayList<String>();
        }
        return this.use;
    }

}

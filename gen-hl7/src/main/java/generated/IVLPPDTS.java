
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IVL_PPD_TS complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IVL_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SXCM_PPD_TS"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{}IVXB_PPD_TS"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{}PPD_PQ" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{}IVXB_PPD_TS" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{}IVXB_PPD_TS"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{}PPD_PQ"/&gt;
 *           &lt;element name="high" type="{}IVXB_PPD_TS" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{}PPD_TS"/&gt;
 *           &lt;element name="width" type="{}PPD_PQ" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_PPD_TS", propOrder = {
    "rest"
})
public class IVLPPDTS
    extends SXCMPPDTS
{

    @XmlElementRefs({
        @XmlElementRef(name = "low", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends QTY>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "High" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 454 von file:/Users/werner.diwischek/dev/ihe-generate/gen-hl7/schema/coreschemas/datatypes.xsd
     * Zeile 445 von file:/Users/werner.diwischek/dev/ihe-generate/gen-hl7/schema/coreschemas/datatypes.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}
     * {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}
     * {@link JAXBElement }{@code <}{@link PPDTS }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends QTY>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends QTY>>();
        }
        return this.rest;
    }

}

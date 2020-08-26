
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Note: because this type is defined as an extension of SXCM_T,
 *             all of the attributes and elements accepted for T are also
 *             accepted by this definition.  However, they are NOT allowed
 *             by the normative description of this type.  Unfortunately,
 *             we cannot write a general purpose schematron contraints to
 *             provide that extra validation, thus applications must be
 *             aware that instance (fragments) that pass validation with
 *             this might might still not be legal.
 *          
 * 
 * <p>Java-Klasse für PIVL_PPD_TS complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PIVL_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SXCM_PPD_TS"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase" type="{}IVL_PPD_TS" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{}PPD_PQ" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alignment" type="{}CalendarCycle" /&gt;
 *       &lt;attribute name="institutionSpecified" type="{}bl" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVL_PPD_TS", propOrder = {
    "phase",
    "period"
})
public class PIVLPPDTS
    extends SXCMPPDTS
{

    protected IVLPPDTS phase;
    protected PPDPQ period;
    @XmlAttribute(name = "alignment")
    protected List<String> alignment;
    @XmlAttribute(name = "institutionSpecified")
    protected Boolean institutionSpecified;

    /**
     * Ruft den Wert der phase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IVLPPDTS }
     *     
     */
    public IVLPPDTS getPhase() {
        return phase;
    }

    /**
     * Legt den Wert der phase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPPDTS }
     *     
     */
    public void setPhase(IVLPPDTS value) {
        this.phase = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PPDPQ }
     *     
     */
    public PPDPQ getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PPDPQ }
     *     
     */
    public void setPeriod(PPDPQ value) {
        this.period = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlignment() {
        if (alignment == null) {
            alignment = new ArrayList<String>();
        }
        return this.alignment;
    }

    /**
     * Ruft den Wert der institutionSpecified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstitutionSpecified() {
        if (institutionSpecified == null) {
            return false;
        } else {
            return institutionSpecified;
        }
    }

    /**
     * Legt den Wert der institutionSpecified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstitutionSpecified(Boolean value) {
        this.institutionSpecified = value;
    }

}

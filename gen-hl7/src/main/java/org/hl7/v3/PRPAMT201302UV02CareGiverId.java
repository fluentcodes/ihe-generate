
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PRPA_MT201302UV02.CareGiver.id complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.CareGiver.id"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}II"&gt;
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.CareGiver.id.updateMode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.CareGiver.id")
public class PRPAMT201302UV02CareGiverId
    extends II
{

    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02CareGiverIdUpdateMode updateMode;

    /**
     * Ruft den Wert der updateMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02CareGiverIdUpdateMode }
     *     
     */
    public PRPAMT201302UV02CareGiverIdUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Legt den Wert der updateMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02CareGiverIdUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02CareGiverIdUpdateMode value) {
        this.updateMode = value;
    }

}

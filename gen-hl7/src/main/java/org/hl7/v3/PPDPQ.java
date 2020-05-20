
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PPD_PQ complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PPD_PQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}PQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standardDeviation" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="distributionType" type="{urn:hl7-org:v3}ProbabilityDistributionType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PPD_PQ", propOrder = {
    "standardDeviation"
})
@XmlSeeAlso({
    SXCMPPDPQ.class,
    IVXBPPDPQ.class
})
public class PPDPQ
    extends PQ
{

    protected PQ standardDeviation;
    @XmlAttribute(name = "distributionType")
    protected ProbabilityDistributionType distributionType;

    /**
     * Ruft den Wert der standardDeviation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Legt den Wert der standardDeviation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setStandardDeviation(PQ value) {
        this.standardDeviation = value;
    }

    /**
     * Ruft den Wert der distributionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public ProbabilityDistributionType getDistributionType() {
        return distributionType;
    }

    /**
     * Legt den Wert der distributionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityDistributionType }
     *     
     */
    public void setDistributionType(ProbabilityDistributionType value) {
        this.distributionType = value;
    }

}

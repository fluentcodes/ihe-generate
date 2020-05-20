
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QUQI_IN000003UV01_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QUQI_IN000003UV01_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}QUQI_IN000003UV01.MCCI_MT000300UV01.Message"&gt;
 *       &lt;attribute name="ITSVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="XML_1.0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUQI_IN000003UV01_Type")
public class QUQIIN000003UV01Type
    extends QUQIIN000003UV01MCCIMT000300UV01Message
{

    @XmlAttribute(name = "ITSVersion", required = true)
    protected String itsVersion;

    /**
     * Ruft den Wert der itsVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITSVersion() {
        if (itsVersion == null) {
            return "XML_1.0";
        } else {
            return itsVersion;
        }
    }

    /**
     * Legt den Wert der itsVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITSVersion(String value) {
        this.itsVersion = value;
    }

}

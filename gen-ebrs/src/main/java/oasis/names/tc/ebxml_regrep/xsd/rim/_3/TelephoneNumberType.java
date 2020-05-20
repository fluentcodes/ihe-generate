
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * TelephoneNumber is the mapping of the same named interface in ebRIM.
 * 
 * <p>Java-Klasse für TelephoneNumberType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="areaCode" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}String8" /&gt;
 *       &lt;attribute name="countryCode" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}String8" /&gt;
 *       &lt;attribute name="extension" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}String8" /&gt;
 *       &lt;attribute name="number" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}String16" /&gt;
 *       &lt;attribute name="phoneType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}String32" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberType")
public class TelephoneNumberType {

    @XmlAttribute(name = "areaCode")
    protected String areaCode;
    @XmlAttribute(name = "countryCode")
    protected String countryCode;
    @XmlAttribute(name = "extension")
    protected String extension;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "phoneType")
    protected String phoneType;

    /**
     * Ruft den Wert der areaCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Legt den Wert der areaCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der phoneType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Legt den Wert der phoneType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

}

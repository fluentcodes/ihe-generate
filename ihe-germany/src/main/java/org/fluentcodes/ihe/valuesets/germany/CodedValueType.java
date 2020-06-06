
package org.fluentcodes.ihe.valuesets.germany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodedValueType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CodedValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://ws.gematik.de/fa/phrext/v1.0}CodeSystem"/&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="originalText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedValueType")
public class CodedValueType {

    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "originalText")
    protected String originalText;
    @XmlAttribute(name = "codeSystem")
    protected String codeSystem;
    @XmlAttribute(name = "codeSystemName")
    protected String codeSystemName;

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der originalText-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * Legt den Wert der originalText-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalText(String value) {
        this.originalText = value;
    }

    /**
     * Ruft den Wert der codeSystem-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Legt den Wert der codeSystem-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
     * Ruft den Wert der codeSystemName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Legt den Wert der codeSystemName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

}

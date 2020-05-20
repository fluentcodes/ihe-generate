
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         ExtrinsicObject is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *       
 * 
 * <p>Java-Klasse für ExtrinsicObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtrinsicObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentVersionInfo" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}VersionInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mimeType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" default="application/octet-stream" /&gt;
 *       &lt;attribute name="isOpaque" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrinsicObjectType", propOrder = {
    "contentVersionInfo"
})
public class ExtrinsicObjectType
    extends RegistryObjectType
{

    @XmlElement(name = "ContentVersionInfo")
    protected VersionInfoType contentVersionInfo;
    @XmlAttribute(name = "mimeType")
    protected String mimeType;
    @XmlAttribute(name = "isOpaque")
    protected Boolean isOpaque;

    /**
     * Ruft den Wert der contentVersionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionInfoType }
     *     
     */
    public VersionInfoType getContentVersionInfo() {
        return contentVersionInfo;
    }

    /**
     * Legt den Wert der contentVersionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionInfoType }
     *     
     */
    public void setContentVersionInfo(VersionInfoType value) {
        this.contentVersionInfo = value;
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        if (mimeType == null) {
            return "application/octet-stream";
        } else {
            return mimeType;
        }
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Ruft den Wert der isOpaque-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsOpaque() {
        if (isOpaque == null) {
            return false;
        } else {
            return isOpaque;
        }
    }

    /**
     * Legt den Wert der isOpaque-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpaque(Boolean value) {
        this.isOpaque = value;
    }

}

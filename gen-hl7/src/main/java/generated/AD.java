
package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Mailing and home or office addresses. A sequence of
 *             address parts, such as street or post office Box, city,
 *             postal code, country, etc.
 *          
 * 
 * <p>Java-Klasse für AD complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="delimiter" type="{}adxp.delimiter"/&gt;
 *           &lt;element name="country" type="{}adxp.country"/&gt;
 *           &lt;element name="state" type="{}adxp.state"/&gt;
 *           &lt;element name="county" type="{}adxp.county"/&gt;
 *           &lt;element name="city" type="{}adxp.city"/&gt;
 *           &lt;element name="postalCode" type="{}adxp.postalCode"/&gt;
 *           &lt;element name="streetAddressLine" type="{}adxp.streetAddressLine"/&gt;
 *           &lt;element name="houseNumber" type="{}adxp.houseNumber"/&gt;
 *           &lt;element name="houseNumberNumeric" type="{}adxp.houseNumberNumeric"/&gt;
 *           &lt;element name="direction" type="{}adxp.direction"/&gt;
 *           &lt;element name="streetName" type="{}adxp.streetName"/&gt;
 *           &lt;element name="streetNameBase" type="{}adxp.streetNameBase"/&gt;
 *           &lt;element name="streetNameType" type="{}adxp.streetNameType"/&gt;
 *           &lt;element name="additionalLocator" type="{}adxp.additionalLocator"/&gt;
 *           &lt;element name="unitID" type="{}adxp.unitID"/&gt;
 *           &lt;element name="unitType" type="{}adxp.unitType"/&gt;
 *           &lt;element name="careOf" type="{}adxp.careOf"/&gt;
 *           &lt;element name="censusTract" type="{}adxp.censusTract"/&gt;
 *           &lt;element name="deliveryAddressLine" type="{}adxp.deliveryAddressLine"/&gt;
 *           &lt;element name="deliveryInstallationType" type="{}adxp.deliveryInstallationType"/&gt;
 *           &lt;element name="deliveryInstallationArea" type="{}adxp.deliveryInstallationArea"/&gt;
 *           &lt;element name="deliveryInstallationQualifier" type="{}adxp.deliveryInstallationQualifier"/&gt;
 *           &lt;element name="deliveryMode" type="{}adxp.deliveryMode"/&gt;
 *           &lt;element name="deliveryModeIdentifier" type="{}adxp.deliveryModeIdentifier"/&gt;
 *           &lt;element name="buildingNumberSuffix" type="{}adxp.buildingNumberSuffix"/&gt;
 *           &lt;element name="postBox" type="{}adxp.postBox"/&gt;
 *           &lt;element name="precinct" type="{}adxp.precinct"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="useablePeriod" type="{}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{}set_PostalAddressUse" /&gt;
 *       &lt;attribute name="isNotOrdered" type="{}bl" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AD", propOrder = {
    "content"
})
public class AD {

    @XmlElementRefs({
        @XmlElementRef(name = "delimiter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "state", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "county", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "city", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postalCode", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetAddressLine", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "houseNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "houseNumberNumeric", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "direction", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetName", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetNameBase", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetNameType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "additionalLocator", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unitID", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unitType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "careOf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "censusTract", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryAddressLine", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationQualifier", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryMode", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryModeIdentifier", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "buildingNumberSuffix", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postBox", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precinct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "useablePeriod", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "use")
    protected List<String> use;
    @XmlAttribute(name = "isNotOrdered")
    protected Boolean isNotOrdered;

    /**
     * 
     *             Mailing and home or office addresses. A sequence of
     *             address parts, such as street or post office Box, city,
     *             postal code, country, etc.
     *          Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpState }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}
     * {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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

    /**
     * Ruft den Wert der isNotOrdered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotOrdered() {
        return isNotOrdered;
    }

    /**
     * Legt den Wert der isNotOrdered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotOrdered(Boolean value) {
        this.isNotOrdered = value;
    }

}

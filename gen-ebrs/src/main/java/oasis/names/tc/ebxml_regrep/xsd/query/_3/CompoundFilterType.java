
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für CompoundFilterType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CompoundFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeftFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"/&gt;
 *         &lt;element name="RightFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="logicalOperator" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName"&gt;
 *             &lt;enumeration value="AND"/&gt;
 *             &lt;enumeration value="OR"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundFilterType", propOrder = {
    "leftFilter",
    "rightFilter"
})
public class CompoundFilterType
    extends FilterType
{

    @XmlElement(name = "LeftFilter", required = true)
    protected FilterType leftFilter;
    @XmlElement(name = "RightFilter", required = true)
    protected FilterType rightFilter;
    @XmlAttribute(name = "logicalOperator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logicalOperator;

    /**
     * Ruft den Wert der leftFilter-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FilterType }
     *
     */
    public FilterType getLeftFilter() {
        return leftFilter;
    }

    /**
     * Legt den Wert der leftFilter-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *
     */
    public void setLeftFilter(FilterType value) {
        this.leftFilter = value;
    }

    /**
     * Ruft den Wert der rightFilter-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FilterType }
     *
     */
    public FilterType getRightFilter() {
        return rightFilter;
    }

    /**
     * Legt den Wert der rightFilter-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *
     */
    public void setRightFilter(FilterType value) {
        this.rightFilter = value;
    }

    /**
     * Ruft den Wert der logicalOperator-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Legt den Wert der logicalOperator-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogicalOperator(String value) {
        this.logicalOperator = value;
    }

}

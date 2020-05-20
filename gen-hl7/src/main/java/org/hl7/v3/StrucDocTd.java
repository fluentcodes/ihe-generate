
package org.hl7.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für StrucDoc.Td complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.Td"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="content" type="{urn:hl7-org:v3}StrucDoc.Content"/&gt;
 *         &lt;element name="linkHtml" type="{urn:hl7-org:v3}StrucDoc.LinkHtml"/&gt;
 *         &lt;element name="sub" type="{urn:hl7-org:v3}StrucDoc.Sub"/&gt;
 *         &lt;element name="sup" type="{urn:hl7-org:v3}StrucDoc.Sup"/&gt;
 *         &lt;element name="br" type="{urn:hl7-org:v3}StrucDoc.Br"/&gt;
 *         &lt;element name="footnote" type="{urn:hl7-org:v3}StrucDoc.Footnote"/&gt;
 *         &lt;element name="footnoteRef" type="{urn:hl7-org:v3}StrucDoc.FootnoteRef"/&gt;
 *         &lt;element name="renderMultiMedia" type="{urn:hl7-org:v3}StrucDoc.RenderMultiMedia"/&gt;
 *         &lt;element name="paragraph" type="{urn:hl7-org:v3}StrucDoc.Paragraph"/&gt;
 *         &lt;element name="list" type="{urn:hl7-org:v3}StrucDoc.List"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" /&gt;
 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="axis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="headers" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *       &lt;attribute name="scope"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="row"/&gt;
 *             &lt;enumeration value="col"/&gt;
 *             &lt;enumeration value="rowgroup"/&gt;
 *             &lt;enumeration value="colgroup"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="align"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="left"/&gt;
 *             &lt;enumeration value="center"/&gt;
 *             &lt;enumeration value="right"/&gt;
 *             &lt;enumeration value="justify"/&gt;
 *             &lt;enumeration value="char"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="valign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="top"/&gt;
 *             &lt;enumeration value="middle"/&gt;
 *             &lt;enumeration value="bottom"/&gt;
 *             &lt;enumeration value="baseline"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.Td", propOrder = {
    "content"
})
public class StrucDocTd {

    @XmlElementRefs({
        @XmlElementRef(name = "content", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "linkHtml", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "footnoteRef", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "renderMultiMedia", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paragraph", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlAttribute(name = "styleCode")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> styleCode;
    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "headers")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> headers;
    @XmlAttribute(name = "scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scope;
    @XmlAttribute(name = "rowspan")
    protected String rowspan;
    @XmlAttribute(name = "colspan")
    protected String colspan;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "char")
    protected String _char;
    @XmlAttribute(name = "charoff")
    protected String charoff;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;

    /**
     * Gets the value of the content property.
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
     * {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}
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
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the styleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleCode() {
        if (styleCode == null) {
            styleCode = new ArrayList<String>();
        }
        return this.styleCode;
    }

    /**
     * Ruft den Wert der abbr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Legt den Wert der abbr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Ruft den Wert der axis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Legt den Wert der axis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Object>();
        }
        return this.headers;
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der rowspan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        if (rowspan == null) {
            return "1";
        } else {
            return rowspan;
        }
    }

    /**
     * Legt den Wert der rowspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Ruft den Wert der colspan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColspan() {
        if (colspan == null) {
            return "1";
        } else {
            return colspan;
        }
    }

    /**
     * Legt den Wert der colspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColspan(String value) {
        this.colspan = value;
    }

    /**
     * Ruft den Wert der align-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Ruft den Wert der char-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Legt den Wert der char-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Ruft den Wert der charoff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Legt den Wert der charoff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Ruft den Wert der valign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Legt den Wert der valign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

}


package oasis.names.tc.xacml._2_0.policy.schema.os;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TargetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TargetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Subjects" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Resources" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Actions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Environments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetType", propOrder = {
    "subjects",
    "resources",
    "actions",
    "environments"
})
public class TargetType {

    @XmlElement(name = "Subjects")
    protected SubjectsType subjects;
    @XmlElement(name = "Resources")
    protected ResourcesType resources;
    @XmlElement(name = "Actions")
    protected ActionsType actions;
    @XmlElement(name = "Environments")
    protected EnvironmentsType environments;

    /**
     * Ruft den Wert der subjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubjectsType }
     *     
     */
    public SubjectsType getSubjects() {
        return subjects;
    }

    /**
     * Legt den Wert der subjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectsType }
     *     
     */
    public void setSubjects(SubjectsType value) {
        this.subjects = value;
    }

    /**
     * Ruft den Wert der resources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * Legt den Wert der resources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * Ruft den Wert der actions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionsType }
     *     
     */
    public ActionsType getActions() {
        return actions;
    }

    /**
     * Legt den Wert der actions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsType }
     *     
     */
    public void setActions(ActionsType value) {
        this.actions = value;
    }

    /**
     * Ruft den Wert der environments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentsType }
     *     
     */
    public EnvironmentsType getEnvironments() {
        return environments;
    }

    /**
     * Legt den Wert der environments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentsType }
     *     
     */
    public void setEnvironments(EnvironmentsType value) {
        this.environments = value;
    }

}

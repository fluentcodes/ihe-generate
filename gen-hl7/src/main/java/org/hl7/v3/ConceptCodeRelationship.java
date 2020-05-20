
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConceptCodeRelationship.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConceptCodeRelationship"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="hasPart"/&gt;
 *     &lt;enumeration value="hasSubtype"/&gt;
 *     &lt;enumeration value="smallerThan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConceptCodeRelationship")
@XmlEnum
public enum ConceptCodeRelationship {

    @XmlEnumValue("hasPart")
    HAS_PART("hasPart"),
    @XmlEnumValue("hasSubtype")
    HAS_SUBTYPE("hasSubtype"),
    @XmlEnumValue("smallerThan")
    SMALLER_THAN("smallerThan");
    private final String value;

    ConceptCodeRelationship(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConceptCodeRelationship fromValue(String v) {
        for (ConceptCodeRelationship c: ConceptCodeRelationship.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

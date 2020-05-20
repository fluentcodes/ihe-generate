
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActRelationshipEntryRelationship.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipEntryRelationship"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="XCRPT"/&gt;
 *     &lt;enumeration value="GEVL"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="RSON"/&gt;
 *     &lt;enumeration value="SUBJ"/&gt;
 *     &lt;enumeration value="SPRT"/&gt;
 *     &lt;enumeration value="CAUS"/&gt;
 *     &lt;enumeration value="MFST"/&gt;
 *     &lt;enumeration value="REFR"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipEntryRelationship")
@XmlEnum
public enum XActRelationshipEntryRelationship {

    XCRPT,
    GEVL,
    COMP,
    RSON,
    SUBJ,
    SPRT,
    CAUS,
    MFST,
    REFR,
    SAS;

    public String value() {
        return name();
    }

    public static XActRelationshipEntryRelationship fromValue(String v) {
        return valueOf(v);
    }

}

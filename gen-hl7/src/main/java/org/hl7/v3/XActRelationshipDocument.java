
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActRelationshipDocument.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipDocument"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="APND"/&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *     &lt;enumeration value="XFRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipDocument")
@XmlEnum
public enum XActRelationshipDocument {

    APND,
    RPLC,
    XFRM;

    public String value() {
        return name();
    }

    public static XActRelationshipDocument fromValue(String v) {
        return valueOf(v);
    }

}

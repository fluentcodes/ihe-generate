
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipJoin.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipJoin"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipJoin")
@XmlEnum
public enum ActRelationshipJoin {

    D,
    X,
    K,
    W;

    public String value() {
        return name();
    }

    public static ActRelationshipJoin fromValue(String v) {
        return valueOf(v);
    }

}

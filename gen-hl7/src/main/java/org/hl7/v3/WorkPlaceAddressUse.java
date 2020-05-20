
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WorkPlaceAddressUse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkPlaceAddressUse"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="WP"/&gt;
 *     &lt;enumeration value="DIR"/&gt;
 *     &lt;enumeration value="PUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkPlaceAddressUse")
@XmlEnum
public enum WorkPlaceAddressUse {

    WP,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static WorkPlaceAddressUse fromValue(String v) {
        return valueOf(v);
    }

}

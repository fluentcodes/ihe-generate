
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationHealthStatusValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationHealthStatusValue"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HLSTAT"/&gt;
 *     &lt;enumeration value="IVDRG"/&gt;
 *     &lt;enumeration value="DISABLE"/&gt;
 *     &lt;enumeration value="DRUG"/&gt;
 *     &lt;enumeration value="PGNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationHealthStatusValue")
@XmlEnum
public enum ObservationHealthStatusValue {

    HLSTAT,
    IVDRG,
    DISABLE,
    DRUG,
    PGNT;

    public String value() {
        return name();
    }

    public static ObservationHealthStatusValue fromValue(String v) {
        return valueOf(v);
    }

}

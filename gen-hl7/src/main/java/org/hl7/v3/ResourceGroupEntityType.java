
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResourceGroupEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceGroupEntityType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PRAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceGroupEntityType")
@XmlEnum
public enum ResourceGroupEntityType {

    PRAC;

    public String value() {
        return name();
    }

    public static ResourceGroupEntityType fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConfidentialityByInfoType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityByInfoType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HIV"/&gt;
 *     &lt;enumeration value="PSY"/&gt;
 *     &lt;enumeration value="SDV"/&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityByInfoType")
@XmlEnum
public enum ConfidentialityByInfoType {

    HIV,
    PSY,
    SDV,
    ETH;

    public String value() {
        return name();
    }

    public static ConfidentialityByInfoType fromValue(String v) {
        return valueOf(v);
    }

}

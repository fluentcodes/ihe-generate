
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdditionalLocator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalLocator"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ADL"/&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="UNID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalLocator")
@XmlEnum
public enum AdditionalLocator {

    ADL,
    UNIT,
    UNID;

    public String value() {
        return name();
    }

    public static AdditionalLocator fromValue(String v) {
        return valueOf(v);
    }

}

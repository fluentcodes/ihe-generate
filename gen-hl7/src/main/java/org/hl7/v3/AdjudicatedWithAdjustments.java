
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdjudicatedWithAdjustments.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjudicatedWithAdjustments"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="ANF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdjudicatedWithAdjustments")
@XmlEnum
public enum AdjudicatedWithAdjustments {

    AA,
    ANF;

    public String value() {
        return name();
    }

    public static AdjudicatedWithAdjustments fromValue(String v) {
        return valueOf(v);
    }

}

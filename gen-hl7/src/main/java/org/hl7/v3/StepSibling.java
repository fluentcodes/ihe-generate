
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StepSibling.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StepSibling"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="STPSIB"/&gt;
 *     &lt;enumeration value="STPBRO"/&gt;
 *     &lt;enumeration value="STPSIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StepSibling")
@XmlEnum
public enum StepSibling {

    STPSIB,
    STPBRO,
    STPSIS;

    public String value() {
        return name();
    }

    public static StepSibling fromValue(String v) {
        return valueOf(v);
    }

}

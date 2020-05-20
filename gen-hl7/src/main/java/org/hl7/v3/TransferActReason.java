
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransferActReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferActReason"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="RQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferActReason")
@XmlEnum
public enum TransferActReason {

    ER,
    RQ;

    public String value() {
        return name();
    }

    public static TransferActReason fromValue(String v) {
        return valueOf(v);
    }

}

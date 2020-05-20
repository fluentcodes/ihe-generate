
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Transfer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Transfer"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="TRANSFER"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Transfer")
@XmlEnum
public enum Transfer {

    TRANSFER,
    SALE;

    public String value() {
        return name();
    }

    public static Transfer fromValue(String v) {
        return valueOf(v);
    }

}

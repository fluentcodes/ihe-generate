
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeTelecommunicationAddress.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeTelecommunicationAddress"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="TEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeTelecommunicationAddress")
@XmlEnum
public enum DataTypeTelecommunicationAddress {

    TEL;

    public String value() {
        return name();
    }

    public static DataTypeTelecommunicationAddress fromValue(String v) {
        return valueOf(v);
    }

}

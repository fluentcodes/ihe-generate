
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EntityClassDocumentReceiving.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassDocumentReceiving"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="HCE"/&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassDocumentReceiving")
@XmlEnum
public enum XEntityClassDocumentReceiving {

    HCE,
    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassDocumentReceiving fromValue(String v) {
        return valueOf(v);
    }

}

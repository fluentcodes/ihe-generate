
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EntityClassPersonOrOrgReceiving.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassPersonOrOrgReceiving"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassPersonOrOrgReceiving")
@XmlEnum
public enum XEntityClassPersonOrOrgReceiving {

    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassPersonOrOrgReceiving fromValue(String v) {
        return valueOf(v);
    }

}

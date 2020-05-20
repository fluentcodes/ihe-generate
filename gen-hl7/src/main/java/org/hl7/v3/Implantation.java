
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Implantation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Implantation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IDIMPLNT"/&gt;
 *     &lt;enumeration value="IVITIMPLNT"/&gt;
 *     &lt;enumeration value="SQIMPLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Implantation")
@XmlEnum
public enum Implantation {

    IDIMPLNT,
    IVITIMPLNT,
    SQIMPLNT;

    public String value() {
        return name();
    }

    public static Implantation fromValue(String v) {
        return valueOf(v);
    }

}

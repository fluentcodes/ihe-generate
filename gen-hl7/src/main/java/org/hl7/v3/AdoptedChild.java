
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdoptedChild.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AdoptedChild"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CHLDADOPT"/&gt;
 *     &lt;enumeration value="DAUADOPT"/&gt;
 *     &lt;enumeration value="SONADOPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdoptedChild")
@XmlEnum
public enum AdoptedChild {

    CHLDADOPT,
    DAUADOPT,
    SONADOPT;

    public String value() {
        return name();
    }

    public static AdoptedChild fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonNameUsePseudonym.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNameUsePseudonym"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonNameUsePseudonym")
@XmlEnum
public enum PersonNameUsePseudonym {

    P,
    A;

    public String value() {
        return name();
    }

    public static PersonNameUsePseudonym fromValue(String v) {
        return valueOf(v);
    }

}

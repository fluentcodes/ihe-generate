
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeIsNotValid.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeIsNotValid"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CODE_INVAL"/&gt;
 *     &lt;enumeration value="CODE_DEPREC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeIsNotValid")
@XmlEnum
public enum CodeIsNotValid {

    CODE_INVAL,
    CODE_DEPREC;

    public String value() {
        return name();
    }

    public static CodeIsNotValid fromValue(String v) {
        return valueOf(v);
    }

}

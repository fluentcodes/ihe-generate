
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PedsClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PedsClinPracticeSetting"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PEDC"/&gt;
 *     &lt;enumeration value="PEDCARD"/&gt;
 *     &lt;enumeration value="PEDE"/&gt;
 *     &lt;enumeration value="PEDGI"/&gt;
 *     &lt;enumeration value="PEDHEM"/&gt;
 *     &lt;enumeration value="PEDID"/&gt;
 *     &lt;enumeration value="PEDNEPH"/&gt;
 *     &lt;enumeration value="PEDHO"/&gt;
 *     &lt;enumeration value="PEDRHEUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PedsClinPracticeSetting")
@XmlEnum
public enum PedsClinPracticeSetting {

    PEDC,
    PEDCARD,
    PEDE,
    PEDGI,
    PEDHEM,
    PEDID,
    PEDNEPH,
    PEDHO,
    PEDRHEUM;

    public String value() {
        return name();
    }

    public static PedsClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

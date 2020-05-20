
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für KutchinHan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="KutchinHan"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-HAA"/&gt;
 *     &lt;enumeration value="x-KUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KutchinHan")
@XmlEnum
public enum KutchinHan {

    @XmlEnumValue("x-HAA")
    X_HAA("x-HAA"),
    @XmlEnumValue("x-KUC")
    X_KUC("x-KUC");
    private final String value;

    KutchinHan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KutchinHan fromValue(String v) {
        for (KutchinHan c: KutchinHan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

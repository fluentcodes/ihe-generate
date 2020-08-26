
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConfidentialityModifiers.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityModifiers"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityModifiers")
@XmlEnum
public enum ConfidentialityModifiers {

    C,
    S,
    T;

    public String value() {
        return name();
    }

    public static ConfidentialityModifiers fromValue(String v) {
        return valueOf(v);
    }

}

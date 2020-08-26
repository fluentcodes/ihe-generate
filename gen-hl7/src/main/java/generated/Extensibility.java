
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Extensibility.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Extensibility"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CNE"/&gt;
 *     &lt;enumeration value="CWE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Extensibility")
@XmlEnum
public enum Extensibility {

    CNE,
    CWE;

    public String value() {
        return name();
    }

    public static Extensibility fromValue(String v) {
        return valueOf(v);
    }

}

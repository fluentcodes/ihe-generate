
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MedicationCap.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationCap"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHILD"/&gt;
 *     &lt;enumeration value="EASY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationCap")
@XmlEnum
public enum MedicationCap {

    CHILD,
    EASY;

    public String value() {
        return name();
    }

    public static MedicationCap fromValue(String v) {
        return valueOf(v);
    }

}

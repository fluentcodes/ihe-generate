
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SurgClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SurgClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SU"/&gt;
 *     &lt;enumeration value="PLS"/&gt;
 *     &lt;enumeration value="URO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurgClinPracticeSetting")
@XmlEnum
public enum SurgClinPracticeSetting {

    SU,
    PLS,
    URO;

    public String value() {
        return name();
    }

    public static SurgClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

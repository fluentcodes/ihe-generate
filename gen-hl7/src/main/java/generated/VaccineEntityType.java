
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VaccineEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VaccineEntityType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VCCNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VaccineEntityType")
@XmlEnum
public enum VaccineEntityType {

    VCCNE;

    public String value() {
        return name();
    }

    public static VaccineEntityType fromValue(String v) {
        return valueOf(v);
    }

}

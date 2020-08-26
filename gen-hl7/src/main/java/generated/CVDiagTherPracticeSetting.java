
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CVDiagTherPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CVDiagTherPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CVDX"/&gt;
 *     &lt;enumeration value="CATH"/&gt;
 *     &lt;enumeration value="ECHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVDiagTherPracticeSetting")
@XmlEnum
public enum CVDiagTherPracticeSetting {

    CVDX,
    CATH,
    ECHO;

    public String value() {
        return name();
    }

    public static CVDiagTherPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

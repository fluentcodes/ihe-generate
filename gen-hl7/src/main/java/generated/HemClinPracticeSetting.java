
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HemClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HemClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="HEM"/&gt;
 *     &lt;enumeration value="PEDHEM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HemClinPracticeSetting")
@XmlEnum
public enum HemClinPracticeSetting {

    HEM,
    PEDHEM;

    public String value() {
        return name();
    }

    public static HemClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

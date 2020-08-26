
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RheumClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RheumClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RHEUM"/&gt;
 *     &lt;enumeration value="PEDRHEUM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RheumClinPracticeSetting")
@XmlEnum
public enum RheumClinPracticeSetting {

    RHEUM,
    PEDRHEUM;

    public String value() {
        return name();
    }

    public static RheumClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

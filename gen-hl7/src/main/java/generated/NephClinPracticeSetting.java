
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NephClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NephClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NEPH"/&gt;
 *     &lt;enumeration value="PEDNEPH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NephClinPracticeSetting")
@XmlEnum
public enum NephClinPracticeSetting {

    NEPH,
    PEDNEPH;

    public String value() {
        return name();
    }

    public static NephClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

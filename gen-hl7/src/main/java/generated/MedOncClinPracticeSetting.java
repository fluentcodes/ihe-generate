
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MedOncClinPracticeSetting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedOncClinPracticeSetting"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ONCL"/&gt;
 *     &lt;enumeration value="PEDHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedOncClinPracticeSetting")
@XmlEnum
public enum MedOncClinPracticeSetting {

    ONCL,
    PEDHO;

    public String value() {
        return name();
    }

    public static MedOncClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

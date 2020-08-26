
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_MedicationOrImmunization.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_MedicationOrImmunization"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DRUG"/&gt;
 *     &lt;enumeration value="IMMUNIZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_MedicationOrImmunization")
@XmlEnum
public enum XMedicationOrImmunization {

    DRUG,
    IMMUNIZ;

    public String value() {
        return name();
    }

    public static XMedicationOrImmunization fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSpecimenTreatmentCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecimenTreatmentCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACID"/&gt;
 *     &lt;enumeration value="ALK"/&gt;
 *     &lt;enumeration value="DEFB"/&gt;
 *     &lt;enumeration value="FILT"/&gt;
 *     &lt;enumeration value="LDLP"/&gt;
 *     &lt;enumeration value="NEUT"/&gt;
 *     &lt;enumeration value="RECA"/&gt;
 *     &lt;enumeration value="UFIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSpecimenTreatmentCode")
@XmlEnum
public enum ActSpecimenTreatmentCode {

    ACID,
    ALK,
    DEFB,
    FILT,
    LDLP,
    NEUT,
    RECA,
    UFIL;

    public String value() {
        return name();
    }

    public static ActSpecimenTreatmentCode fromValue(String v) {
        return valueOf(v);
    }

}

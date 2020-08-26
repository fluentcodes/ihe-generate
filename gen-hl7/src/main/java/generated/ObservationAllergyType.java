
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationAllergyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationAllergyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ALG"/&gt;
 *     &lt;enumeration value="DALG"/&gt;
 *     &lt;enumeration value="EALG"/&gt;
 *     &lt;enumeration value="FALG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationAllergyType")
@XmlEnum
public enum ObservationAllergyType {

    ALG,
    DALG,
    EALG,
    FALG;

    public String value() {
        return name();
    }

    public static ObservationAllergyType fromValue(String v) {
        return valueOf(v);
    }

}

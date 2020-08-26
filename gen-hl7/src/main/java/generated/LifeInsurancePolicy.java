
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LifeInsurancePolicy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LifeInsurancePolicy"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="LIFE"/&gt;
 *     &lt;enumeration value="ANNU"/&gt;
 *     &lt;enumeration value="TLIFE"/&gt;
 *     &lt;enumeration value="ULIFE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LifeInsurancePolicy")
@XmlEnum
public enum LifeInsurancePolicy {

    LIFE,
    ANNU,
    TLIFE,
    ULIFE;

    public String value() {
        return name();
    }

    public static LifeInsurancePolicy fromValue(String v) {
        return valueOf(v);
    }

}

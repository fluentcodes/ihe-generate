
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MucosalAbsorptionRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MucosalAbsorptionRoute"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IDOUDMAB"/&gt;
 *     &lt;enumeration value="ITRACHMAB"/&gt;
 *     &lt;enumeration value="SMUCMAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MucosalAbsorptionRoute")
@XmlEnum
public enum MucosalAbsorptionRoute {

    IDOUDMAB,
    ITRACHMAB,
    SMUCMAB;

    public String value() {
        return name();
    }

    public static MucosalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActClassCareProvisionObservation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionObservation"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionObservation")
@XmlEnum
public enum XActClassCareProvisionObservation {

    PCPR,
    OBS;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionObservation fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmergencyPharmacySupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyPharmacySupplyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmergencyPharmacySupplyType")
@XmlEnum
public enum EmergencyPharmacySupplyType {

    EM,
    SO;

    public String value() {
        return name();
    }

    public static EmergencyPharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

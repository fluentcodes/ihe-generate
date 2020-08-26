
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RefillCompletePharmacySupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillCompletePharmacySupplyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RFC"/&gt;
 *     &lt;enumeration value="RFCS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefillCompletePharmacySupplyType")
@XmlEnum
public enum RefillCompletePharmacySupplyType {

    RFC,
    RFCS;

    public String value() {
        return name();
    }

    public static RefillCompletePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

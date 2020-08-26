
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RefillFirstHerePharmacySupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillFirstHerePharmacySupplyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RFF"/&gt;
 *     &lt;enumeration value="RFFS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefillFirstHerePharmacySupplyType")
@XmlEnum
public enum RefillFirstHerePharmacySupplyType {

    RFF,
    RFFS;

    public String value() {
        return name();
    }

    public static RefillFirstHerePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

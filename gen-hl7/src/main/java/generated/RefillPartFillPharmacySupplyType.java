
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RefillPartFillPharmacySupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillPartFillPharmacySupplyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RFP"/&gt;
 *     &lt;enumeration value="RFPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefillPartFillPharmacySupplyType")
@XmlEnum
public enum RefillPartFillPharmacySupplyType {

    RFP,
    RFPS;

    public String value() {
        return name();
    }

    public static RefillPartFillPharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RefillTrialBalancePharmacySupplyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillTrialBalancePharmacySupplyType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TB"/&gt;
 *     &lt;enumeration value="TBS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefillTrialBalancePharmacySupplyType")
@XmlEnum
public enum RefillTrialBalancePharmacySupplyType {

    TB,
    TBS;

    public String value() {
        return name();
    }

    public static RefillTrialBalancePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PharmacySupplyEventStockReasonCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PharmacySupplyEventStockReasonCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FLRSTCK"/&gt;
 *     &lt;enumeration value="LTC"/&gt;
 *     &lt;enumeration value="OFFICE"/&gt;
 *     &lt;enumeration value="PHARM"/&gt;
 *     &lt;enumeration value="PROG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PharmacySupplyEventStockReasonCode")
@XmlEnum
public enum PharmacySupplyEventStockReasonCode {

    FLRSTCK,
    LTC,
    OFFICE,
    PHARM,
    PROG;

    public String value() {
        return name();
    }

    public static PharmacySupplyEventStockReasonCode fromValue(String v) {
        return valueOf(v);
    }

}

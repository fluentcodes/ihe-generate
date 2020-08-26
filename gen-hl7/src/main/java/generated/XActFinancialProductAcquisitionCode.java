
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActFinancialProductAcquisitionCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActFinancialProductAcquisitionCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActFinancialProductAcquisitionCode")
@XmlEnum
public enum XActFinancialProductAcquisitionCode {

    RENT,
    SALE;

    public String value() {
        return name();
    }

    public static XActFinancialProductAcquisitionCode fromValue(String v) {
        return valueOf(v);
    }

}

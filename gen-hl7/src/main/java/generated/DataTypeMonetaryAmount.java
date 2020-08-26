
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeMonetaryAmount.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeMonetaryAmount"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeMonetaryAmount")
@XmlEnum
public enum DataTypeMonetaryAmount {

    MO;

    public String value() {
        return name();
    }

    public static DataTypeMonetaryAmount fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeAddressPart.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeAddressPart"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ADXP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeAddressPart")
@XmlEnum
public enum DataTypeAddressPart {

    ADXP;

    public String value() {
        return name();
    }

    public static DataTypeAddressPart fromValue(String v) {
        return valueOf(v);
    }

}

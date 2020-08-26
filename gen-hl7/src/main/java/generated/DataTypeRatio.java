
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeRatio.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeRatio"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeRatio")
@XmlEnum
public enum DataTypeRatio {

    RTO;

    public String value() {
        return name();
    }

    public static DataTypeRatio fromValue(String v) {
        return valueOf(v);
    }

}

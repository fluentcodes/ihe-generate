
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypePointInTime.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePointInTime"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypePointInTime")
@XmlEnum
public enum DataTypePointInTime {

    TS;

    public String value() {
        return name();
    }

    public static DataTypePointInTime fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeIntegerNumber.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeIntegerNumber"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="INT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeIntegerNumber")
@XmlEnum
public enum DataTypeIntegerNumber {

    INT;

    public String value() {
        return name();
    }

    public static DataTypeIntegerNumber fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeCodedSimpleValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedSimpleValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedSimpleValue")
@XmlEnum
public enum DataTypeCodedSimpleValue {

    CS;

    public String value() {
        return name();
    }

    public static DataTypeCodedSimpleValue fromValue(String v) {
        return valueOf(v);
    }

}

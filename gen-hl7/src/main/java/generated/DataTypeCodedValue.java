
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeCodedValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedValue")
@XmlEnum
public enum DataTypeCodedValue {

    CV;

    public String value() {
        return name();
    }

    public static DataTypeCodedValue fromValue(String v) {
        return valueOf(v);
    }

}

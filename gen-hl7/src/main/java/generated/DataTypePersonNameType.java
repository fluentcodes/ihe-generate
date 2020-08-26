
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypePersonNameType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePersonNameType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypePersonNameType")
@XmlEnum
public enum DataTypePersonNameType {

    PN;

    public String value() {
        return name();
    }

    public static DataTypePersonNameType fromValue(String v) {
        return valueOf(v);
    }

}

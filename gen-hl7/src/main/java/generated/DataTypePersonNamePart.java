
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypePersonNamePart.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePersonNamePart"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PNXP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypePersonNamePart")
@XmlEnum
public enum DataTypePersonNamePart {

    PNXP;

    public String value() {
        return name();
    }

    public static DataTypePersonNamePart fromValue(String v) {
        return valueOf(v);
    }

}

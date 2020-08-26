
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeInstanceIdentifier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeInstanceIdentifier"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="II"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeInstanceIdentifier")
@XmlEnum
public enum DataTypeInstanceIdentifier {

    II;

    public String value() {
        return name();
    }

    public static DataTypeInstanceIdentifier fromValue(String v) {
        return valueOf(v);
    }

}

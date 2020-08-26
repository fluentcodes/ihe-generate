
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeObjectIdentifier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeObjectIdentifier"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="OID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeObjectIdentifier")
@XmlEnum
public enum DataTypeObjectIdentifier {

    OID;

    public String value() {
        return name();
    }

    public static DataTypeObjectIdentifier fromValue(String v) {
        return valueOf(v);
    }

}

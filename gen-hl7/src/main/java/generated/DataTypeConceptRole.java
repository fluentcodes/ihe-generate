
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeConceptRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeConceptRole"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeConceptRole")
@XmlEnum
public enum DataTypeConceptRole {

    CR;

    public String value() {
        return name();
    }

    public static DataTypeConceptRole fromValue(String v) {
        return valueOf(v);
    }

}

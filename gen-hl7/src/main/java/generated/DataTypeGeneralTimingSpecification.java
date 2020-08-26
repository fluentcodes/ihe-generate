
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypeGeneralTimingSpecification.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeGeneralTimingSpecification"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypeGeneralTimingSpecification")
@XmlEnum
public enum DataTypeGeneralTimingSpecification {

    GTS;

    public String value() {
        return name();
    }

    public static DataTypeGeneralTimingSpecification fromValue(String v) {
        return valueOf(v);
    }

}

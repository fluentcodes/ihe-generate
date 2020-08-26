
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContentProcessingMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentProcessingMode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SEQL"/&gt;
 *     &lt;enumeration value="UNOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentProcessingMode")
@XmlEnum
public enum ContentProcessingMode {

    SEQL,
    UNOR;

    public String value() {
        return name();
    }

    public static ContentProcessingMode fromValue(String v) {
        return valueOf(v);
    }

}

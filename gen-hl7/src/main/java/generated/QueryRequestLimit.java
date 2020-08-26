
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QueryRequestLimit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryRequestLimit"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="RD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryRequestLimit")
@XmlEnum
public enum QueryRequestLimit {

    RD;

    public String value() {
        return name();
    }

    public static QueryRequestLimit fromValue(String v) {
        return valueOf(v);
    }

}

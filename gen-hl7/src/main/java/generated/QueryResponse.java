
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QueryResponse.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryResponse"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="QE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryResponse")
@XmlEnum
public enum QueryResponse {

    AE,
    OK,
    NF,
    QE;

    public String value() {
        return name();
    }

    public static QueryResponse fromValue(String v) {
        return valueOf(v);
    }

}

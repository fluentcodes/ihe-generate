
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SupplyDetectedIssueCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyDetectedIssueCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TOOLATE"/&gt;
 *     &lt;enumeration value="TOOSOON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyDetectedIssueCode")
@XmlEnum
public enum SupplyDetectedIssueCode {

    TOOLATE,
    TOOSOON;

    public String value() {
        return name();
    }

    public static SupplyDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}

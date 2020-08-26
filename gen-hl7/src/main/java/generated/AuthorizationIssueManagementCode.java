
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AuthorizationIssueManagementCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationIssueManagementCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EMAUTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationIssueManagementCode")
@XmlEnum
public enum AuthorizationIssueManagementCode {

    EMAUTH;

    public String value() {
        return name();
    }

    public static AuthorizationIssueManagementCode fromValue(String v) {
        return valueOf(v);
    }

}

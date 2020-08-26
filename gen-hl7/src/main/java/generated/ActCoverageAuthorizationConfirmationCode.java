
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActCoverageAuthorizationConfirmationCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageAuthorizationConfirmationCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="NAUTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageAuthorizationConfirmationCode")
@XmlEnum
public enum ActCoverageAuthorizationConfirmationCode {

    AUTH,
    NAUTH;

    public String value() {
        return name();
    }

    public static ActCoverageAuthorizationConfirmationCode fromValue(String v) {
        return valueOf(v);
    }

}

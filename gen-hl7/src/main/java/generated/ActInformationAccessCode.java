
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInformationAccessCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccessCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ACADR"/&gt;
 *     &lt;enumeration value="ACALLG"/&gt;
 *     &lt;enumeration value="ACOBS"/&gt;
 *     &lt;enumeration value="ACDEMO"/&gt;
 *     &lt;enumeration value="ACIMMUN"/&gt;
 *     &lt;enumeration value="ACLAB"/&gt;
 *     &lt;enumeration value="ACMEDC"/&gt;
 *     &lt;enumeration value="ACMED"/&gt;
 *     &lt;enumeration value="ACPOLPRG"/&gt;
 *     &lt;enumeration value="ACPSERV"/&gt;
 *     &lt;enumeration value="ACPROV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccessCode")
@XmlEnum
public enum ActInformationAccessCode {

    ACADR,
    ACALLG,
    ACOBS,
    ACDEMO,
    ACIMMUN,
    ACLAB,
    ACMEDC,
    ACMED,
    ACPOLPRG,
    ACPSERV,
    ACPROV;

    public String value() {
        return name();
    }

    public static ActInformationAccessCode fromValue(String v) {
        return valueOf(v);
    }

}

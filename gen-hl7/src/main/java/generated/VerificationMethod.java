
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VerificationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationMethod"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="VDOC"/&gt;
 *     &lt;enumeration value="VTOKEN"/&gt;
 *     &lt;enumeration value="VREG"/&gt;
 *     &lt;enumeration value="VVOICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationMethod")
@XmlEnum
public enum VerificationMethod {

    VDOC,
    VTOKEN,
    VREG,
    VVOICE;

    public String value() {
        return name();
    }

    public static VerificationMethod fromValue(String v) {
        return valueOf(v);
    }

}

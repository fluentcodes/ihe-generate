
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_VeryBasicConfidentialityKind.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_VeryBasicConfidentialityKind"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_VeryBasicConfidentialityKind")
@XmlEnum
public enum XVeryBasicConfidentialityKind {

    N,
    R;

    public String value() {
        return name();
    }

    public static XVeryBasicConfidentialityKind fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConfidentialityByAccessKind.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityByAccessKind"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityByAccessKind")
@XmlEnum
public enum ConfidentialityByAccessKind {

    B,
    D,
    I,
    L,
    N,
    R,
    V;

    public String value() {
        return name();
    }

    public static ConfidentialityByAccessKind fromValue(String v) {
        return valueOf(v);
    }

}

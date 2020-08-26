
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassPolicy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPolicy"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="POLICY"/&gt;
 *     &lt;enumeration value="JURISPOL"/&gt;
 *     &lt;enumeration value="ORGPOL"/&gt;
 *     &lt;enumeration value="SCOPOL"/&gt;
 *     &lt;enumeration value="STDPOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassPolicy")
@XmlEnum
public enum ActClassPolicy {

    POLICY,
    JURISPOL,
    ORGPOL,
    SCOPOL,
    STDPOL;

    public String value() {
        return name();
    }

    public static ActClassPolicy fromValue(String v) {
        return valueOf(v);
    }

}

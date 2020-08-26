
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContextControlAdditive.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlAdditive"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContextControlAdditive")
@XmlEnum
public enum ContextControlAdditive {

    AN,
    AP;

    public String value() {
        return name();
    }

    public static ContextControlAdditive fromValue(String v) {
        return valueOf(v);
    }

}

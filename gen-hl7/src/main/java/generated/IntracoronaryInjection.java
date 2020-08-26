
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IntracoronaryInjection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracoronaryInjection"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ICORONINJ"/&gt;
 *     &lt;enumeration value="ICORONINJP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntracoronaryInjection")
@XmlEnum
public enum IntracoronaryInjection {

    ICORONINJ,
    ICORONINJP;

    public String value() {
        return name();
    }

    public static IntracoronaryInjection fromValue(String v) {
        return valueOf(v);
    }

}

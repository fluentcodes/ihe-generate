
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SubsidizedHealthProgram.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsidizedHealthProgram"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SUBSIDIZ"/&gt;
 *     &lt;enumeration value="SUBSIDMC"/&gt;
 *     &lt;enumeration value="SUBSUPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubsidizedHealthProgram")
@XmlEnum
public enum SubsidizedHealthProgram {

    SUBSIDIZ,
    SUBSIDMC,
    SUBSUPP;

    public String value() {
        return name();
    }

    public static SubsidizedHealthProgram fromValue(String v) {
        return valueOf(v);
    }

}

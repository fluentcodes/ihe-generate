
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OralSolution.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OralSolution"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ORALSOL"/&gt;
 *     &lt;enumeration value="ELIXIR"/&gt;
 *     &lt;enumeration value="RINSE"/&gt;
 *     &lt;enumeration value="ORDROP"/&gt;
 *     &lt;enumeration value="SYRUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OralSolution")
@XmlEnum
public enum OralSolution {

    ORALSOL,
    ELIXIR,
    RINSE,
    ORDROP,
    SYRUP;

    public String value() {
        return name();
    }

    public static OralSolution fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassProcedure.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassProcedure"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="SPECCOLLECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassProcedure")
@XmlEnum
public enum ActClassProcedure {

    PROC,
    SPECCOLLECT;

    public String value() {
        return name();
    }

    public static ActClassProcedure fromValue(String v) {
        return valueOf(v);
    }

}

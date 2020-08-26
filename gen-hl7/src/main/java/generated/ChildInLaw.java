
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ChildInLaw.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ChildInLaw"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CHLDINLAW"/&gt;
 *     &lt;enumeration value="DAUINLAW"/&gt;
 *     &lt;enumeration value="SONINLAW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChildInLaw")
@XmlEnum
public enum ChildInLaw {

    CHLDINLAW,
    DAUINLAW,
    SONINLAW;

    public String value() {
        return name();
    }

    public static ChildInLaw fromValue(String v) {
        return valueOf(v);
    }

}

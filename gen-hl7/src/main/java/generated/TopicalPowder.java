
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopicalPowder.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalPowder"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TOPPWD"/&gt;
 *     &lt;enumeration value="RECPWD"/&gt;
 *     &lt;enumeration value="VAGPWD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TopicalPowder")
@XmlEnum
public enum TopicalPowder {

    TOPPWD,
    RECPWD,
    VAGPWD;

    public String value() {
        return name();
    }

    public static TopicalPowder fromValue(String v) {
        return valueOf(v);
    }

}

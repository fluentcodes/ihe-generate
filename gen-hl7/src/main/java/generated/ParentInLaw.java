
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParentInLaw.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParentInLaw"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PRNINLAW"/&gt;
 *     &lt;enumeration value="FTHINLAW"/&gt;
 *     &lt;enumeration value="MTHINLAW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParentInLaw")
@XmlEnum
public enum ParentInLaw {

    PRNINLAW,
    FTHINLAW,
    MTHINLAW;

    public String value() {
        return name();
    }

    public static ParentInLaw fromValue(String v) {
        return valueOf(v);
    }

}

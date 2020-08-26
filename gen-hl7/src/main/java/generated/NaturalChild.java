
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NaturalChild.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalChild"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NCHILD"/&gt;
 *     &lt;enumeration value="DAU"/&gt;
 *     &lt;enumeration value="SON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaturalChild")
@XmlEnum
public enum NaturalChild {

    NCHILD,
    DAU,
    SON;

    public String value() {
        return name();
    }

    public static NaturalChild fromValue(String v) {
        return valueOf(v);
    }

}

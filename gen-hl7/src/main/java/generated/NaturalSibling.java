
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NaturalSibling.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalSibling"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NSIB"/&gt;
 *     &lt;enumeration value="NBRO"/&gt;
 *     &lt;enumeration value="NSIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaturalSibling")
@XmlEnum
public enum NaturalSibling {

    NSIB,
    NBRO,
    NSIS;

    public String value() {
        return name();
    }

    public static NaturalSibling fromValue(String v) {
        return valueOf(v);
    }

}

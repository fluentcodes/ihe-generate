
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonNamePartChangeQualifier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartChangeQualifier"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartChangeQualifier")
@XmlEnum
public enum PersonNamePartChangeQualifier {

    AD,
    BR,
    SP;

    public String value() {
        return name();
    }

    public static PersonNamePartChangeQualifier fromValue(String v) {
        return valueOf(v);
    }

}

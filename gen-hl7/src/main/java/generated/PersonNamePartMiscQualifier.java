
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonNamePartMiscQualifier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartMiscQualifier"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartMiscQualifier")
@XmlEnum
public enum PersonNamePartMiscQualifier {

    CL;

    public String value() {
        return name();
    }

    public static PersonNamePartMiscQualifier fromValue(String v) {
        return valueOf(v);
    }

}

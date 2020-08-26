
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResearchSubjectRoleBasis.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchSubjectRoleBasis"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ERL"/&gt;
 *     &lt;enumeration value="SCN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResearchSubjectRoleBasis")
@XmlEnum
public enum ResearchSubjectRoleBasis {

    ERL,
    SCN;

    public String value() {
        return name();
    }

    public static ResearchSubjectRoleBasis fromValue(String v) {
        return valueOf(v);
    }

}

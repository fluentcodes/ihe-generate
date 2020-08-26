
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActRelationshipPertinentInfo.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPertinentInfo"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SUBJ"/&gt;
 *     &lt;enumeration value="SPRT"/&gt;
 *     &lt;enumeration value="CAUS"/&gt;
 *     &lt;enumeration value="MFST"/&gt;
 *     &lt;enumeration value="REFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPertinentInfo")
@XmlEnum
public enum XActRelationshipPertinentInfo {

    SUBJ,
    SPRT,
    CAUS,
    MFST,
    REFR;

    public String value() {
        return name();
    }

    public static XActRelationshipPertinentInfo fromValue(String v) {
        return valueOf(v);
    }

}

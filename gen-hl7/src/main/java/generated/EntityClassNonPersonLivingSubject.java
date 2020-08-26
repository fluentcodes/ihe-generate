
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityClassNonPersonLivingSubject.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassNonPersonLivingSubject"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="NLIV"/&gt;
 *     &lt;enumeration value="ANM"/&gt;
 *     &lt;enumeration value="MIC"/&gt;
 *     &lt;enumeration value="PLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassNonPersonLivingSubject")
@XmlEnum
public enum EntityClassNonPersonLivingSubject {

    NLIV,
    ANM,
    MIC,
    PLNT;

    public String value() {
        return name();
    }

    public static EntityClassNonPersonLivingSubject fromValue(String v) {
        return valueOf(v);
    }

}

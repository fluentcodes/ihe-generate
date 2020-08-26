
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BiotherapeuticNon-personLivingSubjectRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BiotherapeuticNon-personLivingSubjectRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BIOTH"/&gt;
 *     &lt;enumeration value="ANTIBIOT"/&gt;
 *     &lt;enumeration value="DEBR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BiotherapeuticNon-personLivingSubjectRoleType")
@XmlEnum
public enum BiotherapeuticNonPersonLivingSubjectRoleType {

    BIOTH,
    ANTIBIOT,
    DEBR;

    public String value() {
        return name();
    }

    public static BiotherapeuticNonPersonLivingSubjectRoleType fromValue(String v) {
        return valueOf(v);
    }

}

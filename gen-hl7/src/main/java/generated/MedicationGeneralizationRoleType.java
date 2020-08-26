
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MedicationGeneralizationRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationGeneralizationRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GDF"/&gt;
 *     &lt;enumeration value="GDS"/&gt;
 *     &lt;enumeration value="GDSF"/&gt;
 *     &lt;enumeration value="MGDSF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationGeneralizationRoleType")
@XmlEnum
public enum MedicationGeneralizationRoleType {

    GD,
    GDF,
    GDS,
    GDSF,
    MGDSF;

    public String value() {
        return name();
    }

    public static MedicationGeneralizationRoleType fromValue(String v) {
        return valueOf(v);
    }

}

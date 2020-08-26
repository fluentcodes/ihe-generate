
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonRigidContainerEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NonRigidContainerEntityType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BAG"/&gt;
 *     &lt;enumeration value="PACKT"/&gt;
 *     &lt;enumeration value="PCH"/&gt;
 *     &lt;enumeration value="SACH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonRigidContainerEntityType")
@XmlEnum
public enum NonRigidContainerEntityType {

    BAG,
    PACKT,
    PCH,
    SACH;

    public String value() {
        return name();
    }

    public static NonRigidContainerEntityType fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoleClassManufacturedProduct.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassManufacturedProduct"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="THER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassManufacturedProduct")
@XmlEnum
public enum RoleClassManufacturedProduct {

    MANU,
    THER;

    public String value() {
        return name();
    }

    public static RoleClassManufacturedProduct fromValue(String v) {
        return valueOf(v);
    }

}

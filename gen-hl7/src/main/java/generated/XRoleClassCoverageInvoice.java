
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_RoleClassCoverageInvoice.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverageInvoice"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PAYOR"/&gt;
 *     &lt;enumeration value="PAYEE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCoverageInvoice")
@XmlEnum
public enum XRoleClassCoverageInvoice {

    PAYOR,
    PAYEE;

    public String value() {
        return name();
    }

    public static XRoleClassCoverageInvoice fromValue(String v) {
        return valueOf(v);
    }

}

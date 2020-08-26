
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceDetailGenericModifierCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceDetailGenericModifierCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ISOL"/&gt;
 *     &lt;enumeration value="AFTHRS"/&gt;
 *     &lt;enumeration value="OOO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceDetailGenericModifierCode")
@XmlEnum
public enum ActInvoiceDetailGenericModifierCode {

    ISOL,
    AFTHRS,
    OOO;

    public String value() {
        return name();
    }

    public static ActInvoiceDetailGenericModifierCode fromValue(String v) {
        return valueOf(v);
    }

}

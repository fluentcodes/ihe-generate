
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceElementModifier.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceElementModifier"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EFORM"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="LINV"/&gt;
 *     &lt;enumeration value="PAPER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceElementModifier")
@XmlEnum
public enum ActInvoiceElementModifier {

    EFORM,
    FAX,
    LINV,
    PAPER;

    public String value() {
        return name();
    }

    public static ActInvoiceElementModifier fromValue(String v) {
        return valueOf(v);
    }

}

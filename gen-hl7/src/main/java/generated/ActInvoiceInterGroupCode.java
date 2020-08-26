
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInvoiceInterGroupCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceInterGroupCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="CPNDDRGING"/&gt;
 *     &lt;enumeration value="CPNDINDING"/&gt;
 *     &lt;enumeration value="CPNDSUPING"/&gt;
 *     &lt;enumeration value="DRUGING"/&gt;
 *     &lt;enumeration value="FRAMEING"/&gt;
 *     &lt;enumeration value="LENSING"/&gt;
 *     &lt;enumeration value="PRDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceInterGroupCode")
@XmlEnum
public enum ActInvoiceInterGroupCode {

    CPNDDRGING,
    CPNDINDING,
    CPNDSUPING,
    DRUGING,
    FRAMEING,
    LENSING,
    PRDING;

    public String value() {
        return name();
    }

    public static ActInvoiceInterGroupCode fromValue(String v) {
        return valueOf(v);
    }

}

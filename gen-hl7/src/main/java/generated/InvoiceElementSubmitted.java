
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InvoiceElementSubmitted.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceElementSubmitted"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SBBLELAT"/&gt;
 *     &lt;enumeration value="SBBLELCT"/&gt;
 *     &lt;enumeration value="SBNFELCT"/&gt;
 *     &lt;enumeration value="SBNFELAT"/&gt;
 *     &lt;enumeration value="SBPDELAT"/&gt;
 *     &lt;enumeration value="SBPDELCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceElementSubmitted")
@XmlEnum
public enum InvoiceElementSubmitted {

    SBBLELAT,
    SBBLELCT,
    SBNFELCT,
    SBNFELAT,
    SBPDELAT,
    SBPDELCT;

    public String value() {
        return name();
    }

    public static InvoiceElementSubmitted fromValue(String v) {
        return valueOf(v);
    }

}

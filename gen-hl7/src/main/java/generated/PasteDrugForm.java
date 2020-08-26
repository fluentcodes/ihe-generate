
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PasteDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PasteDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PASTE"/&gt;
 *     &lt;enumeration value="PUD"/&gt;
 *     &lt;enumeration value="TPASTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PasteDrugForm")
@XmlEnum
public enum PasteDrugForm {

    PASTE,
    PUD,
    TPASTE;

    public String value() {
        return name();
    }

    public static PasteDrugForm fromValue(String v) {
        return valueOf(v);
    }

}

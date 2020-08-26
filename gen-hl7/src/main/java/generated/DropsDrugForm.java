
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DropsDrugForm.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DropsDrugForm"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DROP"/&gt;
 *     &lt;enumeration value="NDROP"/&gt;
 *     &lt;enumeration value="OPDROP"/&gt;
 *     &lt;enumeration value="ORDROP"/&gt;
 *     &lt;enumeration value="OTDROP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DropsDrugForm")
@XmlEnum
public enum DropsDrugForm {

    DROP,
    NDROP,
    OPDROP,
    ORDROP,
    OTDROP;

    public String value() {
        return name();
    }

    public static DropsDrugForm fromValue(String v) {
        return valueOf(v);
    }

}


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DosageProblem.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DosageProblem"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOSE"/&gt;
 *     &lt;enumeration value="DOSEDUR"/&gt;
 *     &lt;enumeration value="DOSEIVL"/&gt;
 *     &lt;enumeration value="DOSEH"/&gt;
 *     &lt;enumeration value="DOSEL"/&gt;
 *     &lt;enumeration value="DOSECOND"/&gt;
 *     &lt;enumeration value="MDOSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DosageProblem")
@XmlEnum
public enum DosageProblem {

    DOSE,
    DOSEDUR,
    DOSEIVL,
    DOSEH,
    DOSEL,
    DOSECOND,
    MDOSE;

    public String value() {
        return name();
    }

    public static DosageProblem fromValue(String v) {
        return valueOf(v);
    }

}

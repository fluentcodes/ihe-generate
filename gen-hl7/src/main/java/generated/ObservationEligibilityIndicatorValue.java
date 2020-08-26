
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationEligibilityIndicatorValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationEligibilityIndicatorValue"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ELSTAT"/&gt;
 *     &lt;enumeration value="ADOPT"/&gt;
 *     &lt;enumeration value="BTHCERT"/&gt;
 *     &lt;enumeration value="CCOC"/&gt;
 *     &lt;enumeration value="DRLIC"/&gt;
 *     &lt;enumeration value="FOSTER"/&gt;
 *     &lt;enumeration value="MRGCERT"/&gt;
 *     &lt;enumeration value="MIL"/&gt;
 *     &lt;enumeration value="PASSPORT"/&gt;
 *     &lt;enumeration value="MEMBER"/&gt;
 *     &lt;enumeration value="STUDENRL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationEligibilityIndicatorValue")
@XmlEnum
public enum ObservationEligibilityIndicatorValue {

    ELSTAT,
    ADOPT,
    BTHCERT,
    CCOC,
    DRLIC,
    FOSTER,
    MRGCERT,
    MIL,
    PASSPORT,
    MEMBER,
    STUDENRL;

    public String value() {
        return name();
    }

    public static ObservationEligibilityIndicatorValue fromValue(String v) {
        return valueOf(v);
    }

}

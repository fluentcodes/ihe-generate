
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActRelationshipSplit.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipSplit"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="E1"/&gt;
 *     &lt;enumeration value="EW"/&gt;
 *     &lt;enumeration value="I1"/&gt;
 *     &lt;enumeration value="IW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipSplit")
@XmlEnum
public enum ActRelationshipSplit {

    @XmlEnumValue("E1")
    E_1("E1"),
    EW("EW"),
    @XmlEnumValue("I1")
    I_1("I1"),
    IW("IW");
    private final String value;

    ActRelationshipSplit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipSplit fromValue(String v) {
        for (ActRelationshipSplit c: ActRelationshipSplit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

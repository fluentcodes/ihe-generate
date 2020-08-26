
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValueSetPropertyId.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSetPropertyId"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="appliesTo"/&gt;
 *     &lt;enumeration value="howApplies"/&gt;
 *     &lt;enumeration value="openIssue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueSetPropertyId")
@XmlEnum
public enum ValueSetPropertyId {

    @XmlEnumValue("appliesTo")
    APPLIES_TO("appliesTo"),
    @XmlEnumValue("howApplies")
    HOW_APPLIES("howApplies"),
    @XmlEnumValue("openIssue")
    OPEN_ISSUE("openIssue");
    private final String value;

    ValueSetPropertyId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueSetPropertyId fromValue(String v) {
        for (ValueSetPropertyId c: ValueSetPropertyId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

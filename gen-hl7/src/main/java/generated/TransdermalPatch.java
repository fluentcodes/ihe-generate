
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransdermalPatch.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransdermalPatch"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="TPATCH"/&gt;
 *     &lt;enumeration value="TPATH16"/&gt;
 *     &lt;enumeration value="TPATH24"/&gt;
 *     &lt;enumeration value="TPATH72"/&gt;
 *     &lt;enumeration value="TPATH2WK"/&gt;
 *     &lt;enumeration value="TPATHWK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransdermalPatch")
@XmlEnum
public enum TransdermalPatch {

    TPATCH("TPATCH"),
    @XmlEnumValue("TPATH16")
    TPATH_16("TPATH16"),
    @XmlEnumValue("TPATH24")
    TPATH_24("TPATH24"),
    @XmlEnumValue("TPATH72")
    TPATH_72("TPATH72"),
    @XmlEnumValue("TPATH2WK")
    TPATH_2_WK("TPATH2WK"),
    TPATHWK("TPATHWK");
    private final String value;

    TransdermalPatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransdermalPatch fromValue(String v) {
        for (TransdermalPatch c: TransdermalPatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

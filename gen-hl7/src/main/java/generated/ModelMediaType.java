
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ModelMediaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModelMediaType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="model/vrml"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModelMediaType")
@XmlEnum
public enum ModelMediaType {

    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml");
    private final String value;

    ModelMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelMediaType fromValue(String v) {
        for (ModelMediaType c: ModelMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

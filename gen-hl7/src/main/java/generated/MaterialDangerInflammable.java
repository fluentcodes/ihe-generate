
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MaterialDangerInflammable.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDangerInflammable"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="IFL"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaterialDangerInflammable")
@XmlEnum
public enum MaterialDangerInflammable {

    IFL,
    EXP;

    public String value() {
        return name();
    }

    public static MaterialDangerInflammable fromValue(String v) {
        return valueOf(v);
    }

}

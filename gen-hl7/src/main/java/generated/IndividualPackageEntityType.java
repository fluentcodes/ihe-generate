
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndividualPackageEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IndividualPackageEntityType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AMP"/&gt;
 *     &lt;enumeration value="MINIM"/&gt;
 *     &lt;enumeration value="NEBAMP"/&gt;
 *     &lt;enumeration value="OVUL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndividualPackageEntityType")
@XmlEnum
public enum IndividualPackageEntityType {

    AMP,
    MINIM,
    NEBAMP,
    OVUL;

    public String value() {
        return name();
    }

    public static IndividualPackageEntityType fromValue(String v) {
        return valueOf(v);
    }

}

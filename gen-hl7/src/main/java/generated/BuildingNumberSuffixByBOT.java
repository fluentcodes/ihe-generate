
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuildingNumberSuffixByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingNumberSuffixByBOT"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="BNS"/&gt;
 *     &lt;enumeration value="POB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuildingNumberSuffixByBOT")
@XmlEnum
public enum BuildingNumberSuffixByBOT {

    BNS,
    POB;

    public String value() {
        return name();
    }

    public static BuildingNumberSuffixByBOT fromValue(String v) {
        return valueOf(v);
    }

}

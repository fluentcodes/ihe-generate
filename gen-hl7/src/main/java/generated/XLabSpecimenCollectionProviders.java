
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_LabSpecimenCollectionProviders.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabSpecimenCollectionProviders"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="communityLaboratory"/&gt;
 *     &lt;enumeration value="homeHealth"/&gt;
 *     &lt;enumeration value="laboratory"/&gt;
 *     &lt;enumeration value="pathologist"/&gt;
 *     &lt;enumeration value="phlebotomist"/&gt;
 *     &lt;enumeration value="self"/&gt;
 *     &lt;enumeration value="thirdParty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_LabSpecimenCollectionProviders")
@XmlEnum
public enum XLabSpecimenCollectionProviders {

    @XmlEnumValue("communityLaboratory")
    COMMUNITY_LABORATORY("communityLaboratory"),
    @XmlEnumValue("homeHealth")
    HOME_HEALTH("homeHealth"),
    @XmlEnumValue("laboratory")
    LABORATORY("laboratory"),
    @XmlEnumValue("pathologist")
    PATHOLOGIST("pathologist"),
    @XmlEnumValue("phlebotomist")
    PHLEBOTOMIST("phlebotomist"),
    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("thirdParty")
    THIRD_PARTY("thirdParty");
    private final String value;

    XLabSpecimenCollectionProviders(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XLabSpecimenCollectionProviders fromValue(String v) {
        for (XLabSpecimenCollectionProviders c: XLabSpecimenCollectionProviders.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

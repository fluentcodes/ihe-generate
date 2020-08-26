
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CoverageSponsorRoleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageSponsorRoleType"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="FULLINS"/&gt;
 *     &lt;enumeration value="SELFINS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoverageSponsorRoleType")
@XmlEnum
public enum CoverageSponsorRoleType {

    FULLINS,
    SELFINS;

    public String value() {
        return name();
    }

    public static CoverageSponsorRoleType fromValue(String v) {
        return valueOf(v);
    }

}

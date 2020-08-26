
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActMedicalServiceCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicalServiceCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="ALC"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="DNTL"/&gt;
 *     &lt;enumeration value="DRGRHB"/&gt;
 *     &lt;enumeration value="GENRL"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *     &lt;enumeration value="ONC"/&gt;
 *     &lt;enumeration value="PALL"/&gt;
 *     &lt;enumeration value="PED"/&gt;
 *     &lt;enumeration value="PHAR"/&gt;
 *     &lt;enumeration value="PHYRHB"/&gt;
 *     &lt;enumeration value="PSYCH"/&gt;
 *     &lt;enumeration value="SURG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMedicalServiceCode")
@XmlEnum
public enum ActMedicalServiceCode {

    ALC,
    CARD,
    CHR,
    DNTL,
    DRGRHB,
    GENRL,
    MED,
    OBS,
    ONC,
    PALL,
    PED,
    PHAR,
    PHYRHB,
    PSYCH,
    SURG;

    public String value() {
        return name();
    }

    public static ActMedicalServiceCode fromValue(String v) {
        return valueOf(v);
    }

}

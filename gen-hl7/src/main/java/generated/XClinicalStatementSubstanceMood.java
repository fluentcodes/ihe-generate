
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ClinicalStatementSubstanceMood.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ClinicalStatementSubstanceMood"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EVN"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="PRMS"/&gt;
 *     &lt;enumeration value="PRP"/&gt;
 *     &lt;enumeration value="RQO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ClinicalStatementSubstanceMood")
@XmlEnum
public enum XClinicalStatementSubstanceMood {

    EVN,
    INT,
    PRMS,
    PRP,
    RQO;

    public String value() {
        return name();
    }

    public static XClinicalStatementSubstanceMood fromValue(String v) {
        return valueOf(v);
    }

}

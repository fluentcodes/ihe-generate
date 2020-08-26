
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActClassClinicalDocument.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassClinicalDocument"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DOCCLIN"/&gt;
 *     &lt;enumeration value="CDALVLONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassClinicalDocument")
@XmlEnum
public enum ActClassClinicalDocument {

    DOCCLIN,
    CDALVLONE;

    public String value() {
        return name();
    }

    public static ActClassClinicalDocument fromValue(String v) {
        return valueOf(v);
    }

}

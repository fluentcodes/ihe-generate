
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActAdjudicationResultActionCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdjudicationResultActionCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="DISPLAY"/&gt;
 *     &lt;enumeration value="FORM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActAdjudicationResultActionCode")
@XmlEnum
public enum ActAdjudicationResultActionCode {

    DISPLAY,
    FORM;

    public String value() {
        return name();
    }

    public static ActAdjudicationResultActionCode fromValue(String v) {
        return valueOf(v);
    }

}

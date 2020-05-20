
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RelationalOperator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperator"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="EQ"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperator")
@XmlEnum
public enum RelationalOperator {

    CT,
    EQ,
    GN,
    GT,
    GE,
    LT,
    LE,
    NE;

    public String value() {
        return name();
    }

    public static RelationalOperator fromValue(String v) {
        return valueOf(v);
    }

}

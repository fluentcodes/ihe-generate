
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QueryStatusCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryStatusCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="deliveredResponse"/&gt;
 *     &lt;enumeration value="executing"/&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="waitContinuedQueryResponse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryStatusCode")
@XmlEnum
public enum QueryStatusCode {

    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("deliveredResponse")
    DELIVERED_RESPONSE("deliveredResponse"),
    @XmlEnumValue("executing")
    EXECUTING("executing"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("waitContinuedQueryResponse")
    WAIT_CONTINUED_QUERY_RESPONSE("waitContinuedQueryResponse");
    private final String value;

    QueryStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatusCode fromValue(String v) {
        for (QueryStatusCode c: QueryStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

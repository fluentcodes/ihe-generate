
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActClassCareProvisionProcedure.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionProcedure"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionProcedure")
@XmlEnum
public enum XActClassCareProvisionProcedure {

    PCPR,
    PROC;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionProcedure fromValue(String v) {
        return valueOf(v);
    }

}

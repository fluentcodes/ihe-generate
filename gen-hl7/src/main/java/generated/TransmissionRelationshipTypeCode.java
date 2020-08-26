
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransmissionRelationshipTypeCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionRelationshipTypeCode"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="SEQL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransmissionRelationshipTypeCode")
@XmlEnum
public enum TransmissionRelationshipTypeCode {

    SEQL;

    public String value() {
        return name();
    }

    public static TransmissionRelationshipTypeCode fromValue(String v) {
        return valueOf(v);
    }

}

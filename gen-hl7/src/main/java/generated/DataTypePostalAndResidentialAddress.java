
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataTypePostalAndResidentialAddress.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePostalAndResidentialAddress"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="AD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataTypePostalAndResidentialAddress")
@XmlEnum
public enum DataTypePostalAndResidentialAddress {

    AD;

    public String value() {
        return name();
    }

    public static DataTypePostalAndResidentialAddress fromValue(String v) {
        return valueOf(v);
    }

}

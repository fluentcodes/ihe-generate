
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_PhoneOrEmailURLScheme.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PhoneOrEmailURLScheme"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="mailto"/&gt;
 *     &lt;enumeration value="tel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_PhoneOrEmailURLScheme")
@XmlEnum
public enum XPhoneOrEmailURLScheme {

    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    @XmlEnumValue("tel")
    TEL("tel");
    private final String value;

    XPhoneOrEmailURLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPhoneOrEmailURLScheme fromValue(String v) {
        for (XPhoneOrEmailURLScheme c: XPhoneOrEmailURLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

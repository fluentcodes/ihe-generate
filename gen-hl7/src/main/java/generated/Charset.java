
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Charset.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Charset"&gt;
 *   &lt;restriction base="{}cs"&gt;
 *     &lt;enumeration value="EBCDIC"/&gt;
 *     &lt;enumeration value="ISO-10646-UCS-2"/&gt;
 *     &lt;enumeration value="ISO-10646-UCS-4"/&gt;
 *     &lt;enumeration value="ISO-8859-1"/&gt;
 *     &lt;enumeration value="ISO-8859-2"/&gt;
 *     &lt;enumeration value="ISO-8859-5"/&gt;
 *     &lt;enumeration value="JIS-2022-JP"/&gt;
 *     &lt;enumeration value="US-ASCII"/&gt;
 *     &lt;enumeration value="UTF-7"/&gt;
 *     &lt;enumeration value="UTF-8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Charset")
@XmlEnum
public enum Charset {

    EBCDIC("EBCDIC"),
    @XmlEnumValue("ISO-10646-UCS-2")
    ISO_10646_UCS_2("ISO-10646-UCS-2"),
    @XmlEnumValue("ISO-10646-UCS-4")
    ISO_10646_UCS_4("ISO-10646-UCS-4"),
    @XmlEnumValue("ISO-8859-1")
    ISO_8859_1("ISO-8859-1"),
    @XmlEnumValue("ISO-8859-2")
    ISO_8859_2("ISO-8859-2"),
    @XmlEnumValue("ISO-8859-5")
    ISO_8859_5("ISO-8859-5"),
    @XmlEnumValue("JIS-2022-JP")
    JIS_2022_JP("JIS-2022-JP"),
    @XmlEnumValue("US-ASCII")
    US_ASCII("US-ASCII"),
    @XmlEnumValue("UTF-7")
    UTF_7("UTF-7"),
    @XmlEnumValue("UTF-8")
    UTF_8("UTF-8");
    private final String value;

    Charset(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Charset fromValue(String v) {
        for (Charset c: Charset.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

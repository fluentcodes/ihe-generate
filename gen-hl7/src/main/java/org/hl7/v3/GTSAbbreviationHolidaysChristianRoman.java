
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GTSAbbreviationHolidaysChristianRoman.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GTSAbbreviationHolidaysChristianRoman"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="JHCHREAS"/&gt;
 *     &lt;enumeration value="JHCHRGFR"/&gt;
 *     &lt;enumeration value="JHCHRNEW"/&gt;
 *     &lt;enumeration value="JHCHRPEN"/&gt;
 *     &lt;enumeration value="JHCHRXME"/&gt;
 *     &lt;enumeration value="JHCHRXMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GTSAbbreviationHolidaysChristianRoman")
@XmlEnum
public enum GTSAbbreviationHolidaysChristianRoman {

    JHCHREAS,
    JHCHRGFR,
    JHCHRNEW,
    JHCHRPEN,
    JHCHRXME,
    JHCHRXMS;

    public String value() {
        return name();
    }

    public static GTSAbbreviationHolidaysChristianRoman fromValue(String v) {
        return valueOf(v);
    }

}

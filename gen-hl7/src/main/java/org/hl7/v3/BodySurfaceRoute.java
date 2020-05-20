
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BodySurfaceRoute.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BodySurfaceRoute"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ELECTOSMOS"/&gt;
 *     &lt;enumeration value="SOAK"/&gt;
 *     &lt;enumeration value="TOPICAL"/&gt;
 *     &lt;enumeration value="IONTO"/&gt;
 *     &lt;enumeration value="DRESS"/&gt;
 *     &lt;enumeration value="SWAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BodySurfaceRoute")
@XmlEnum
public enum BodySurfaceRoute {

    ELECTOSMOS,
    SOAK,
    TOPICAL,
    IONTO,
    DRESS,
    SWAB;

    public String value() {
        return name();
    }

    public static BodySurfaceRoute fromValue(String v) {
        return valueOf(v);
    }

}

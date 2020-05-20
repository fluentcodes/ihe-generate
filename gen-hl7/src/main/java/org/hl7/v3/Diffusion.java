
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Diffusion.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Diffusion"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EXTCORPDIF"/&gt;
 *     &lt;enumeration value="HEMODIFF"/&gt;
 *     &lt;enumeration value="TRNSDERMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Diffusion")
@XmlEnum
public enum Diffusion {

    EXTCORPDIF,
    HEMODIFF,
    TRNSDERMD;

    public String value() {
        return name();
    }

    public static Diffusion fromValue(String v) {
        return valueOf(v);
    }

}

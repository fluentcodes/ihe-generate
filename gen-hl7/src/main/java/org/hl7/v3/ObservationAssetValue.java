
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationAssetValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationAssetValue"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ASSET"/&gt;
 *     &lt;enumeration value="ANNUITY"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="RETACCT"/&gt;
 *     &lt;enumeration value="TRUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationAssetValue")
@XmlEnum
public enum ObservationAssetValue {

    ASSET,
    ANNUITY,
    PROP,
    RETACCT,
    TRUST;

    public String value() {
        return name();
    }

    public static ObservationAssetValue fromValue(String v) {
        return valueOf(v);
    }

}

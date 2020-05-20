
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InvoiceElementPaid.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceElementPaid"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PDNPPPELAT"/&gt;
 *     &lt;enumeration value="PDNPPPELCT"/&gt;
 *     &lt;enumeration value="PDNPPPMNAT"/&gt;
 *     &lt;enumeration value="PDNPPPMNCT"/&gt;
 *     &lt;enumeration value="PDNPSPELAT"/&gt;
 *     &lt;enumeration value="PDNPSPELCT"/&gt;
 *     &lt;enumeration value="PDNPSPMNAT"/&gt;
 *     &lt;enumeration value="PDNPSPMNCT"/&gt;
 *     &lt;enumeration value="PDNFPPELAT"/&gt;
 *     &lt;enumeration value="PDNFPPELCT"/&gt;
 *     &lt;enumeration value="PDNFPPMNAT"/&gt;
 *     &lt;enumeration value="PDNFPPMNCT"/&gt;
 *     &lt;enumeration value="PDNFSPELAT"/&gt;
 *     &lt;enumeration value="PDNFSPELCT"/&gt;
 *     &lt;enumeration value="PDNFSPMNAT"/&gt;
 *     &lt;enumeration value="PDNFSPMNCT"/&gt;
 *     &lt;enumeration value="PDPPPPELAT"/&gt;
 *     &lt;enumeration value="PDPPPPELCT"/&gt;
 *     &lt;enumeration value="PDPPPPMNAT"/&gt;
 *     &lt;enumeration value="PDPPPPMNCT"/&gt;
 *     &lt;enumeration value="PDPPSPELAT"/&gt;
 *     &lt;enumeration value="PDPPSPELCT"/&gt;
 *     &lt;enumeration value="PDPPSPMNAT"/&gt;
 *     &lt;enumeration value="PDPPSPMNCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceElementPaid")
@XmlEnum
public enum InvoiceElementPaid {

    PDNPPPELAT,
    PDNPPPELCT,
    PDNPPPMNAT,
    PDNPPPMNCT,
    PDNPSPELAT,
    PDNPSPELCT,
    PDNPSPMNAT,
    PDNPSPMNCT,
    PDNFPPELAT,
    PDNFPPELCT,
    PDNFPPMNAT,
    PDNFPPMNCT,
    PDNFSPELAT,
    PDNFSPELCT,
    PDNFSPMNAT,
    PDNFSPMNCT,
    PDPPPPELAT,
    PDPPPPELCT,
    PDPPPPMNAT,
    PDPPPPMNCT,
    PDPPSPELAT,
    PDPPSPELCT,
    PDPPSPMNAT,
    PDPPSPMNCT;

    public String value() {
        return name();
    }

    public static InvoiceElementPaid fromValue(String v) {
        return valueOf(v);
    }

}

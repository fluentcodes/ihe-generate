
package oasis.names.tc.ebxml_regrep.xsd.cms._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType;


/**
 * Base type for all Content Management Service responses
 * 
 * <p>Java-Klasse für ContentManagementServiceResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentManagementServiceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryResponseType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentManagementServiceResponseType")
@XmlSeeAlso({
    CatalogContentResponse.class,
    ValidateContentResponse.class
})
public class ContentManagementServiceResponseType
    extends RegistryResponseType
{


}

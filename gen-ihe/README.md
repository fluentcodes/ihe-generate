# IHE Generated Library
This project deliver simple generated classes from IHE ITI and some wrapper for it to accomplish the complex mapping to elementary fields.

Target of this project is to generate the ebXML/IHE messages from a simple json format and vice versa.

The simple json format
```
{
  "formatCode" : "urn:ihe:pcc:edr:2007",
  "id" : "document"
} 
```
will create the following IHE/ebXML code:
```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ExtrinsicObjectType id="document" xmlns:ns="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0">
    <ns:Classification classifiedObject="document" nodeRepresentation="urn:ihe:pcc:edr:2007" objectType="urn:oasis:names:tc:ebxml-regrep:ObjectType:RegistryObject:Classification" id="FormatCode_0">
        <ns:Slot name="codingScheme">
            <ns:ValueList>
                <ns:Value>1.3.6.1.4.1.19376.1.2.3</ns:Value>
            </ns:ValueList>
        </ns:Slot>
        <ns:Name>
            <ns:LocalizedString value="Emergency Department Referral (EDR)"/>
        </ns:Name>
    </ns:Classification>
</ExtrinsicObjectType>
```
and back to the JSON format
```
{
  "formatCode" : "urn:ihe:pcc:edr:2007^^1.3.6.1.4.1.19376.1.2.3",
  "id" : "document"
} 
```

The schemas are a part from the schema/wsdl in version 3.1.3 from the portal of gematik. 

* https://www.ihe.net/resources/technical_frameworks/technical_framework_archives/
* https://fachportal.gematik.de/fileadmin/user_upload/fachportal/files/Spezifikationen/Produktivbetrieb/Schemata_WDSL/OPB3.1_R3.1.3_Schemadateien_20200302.zip"# generated-ihe-ebRS" 

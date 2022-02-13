# IHE Generated Stuff

I've started this project after working on "Digitale Gesundheitsakte" at Gematik,  
an IHE project in Germany. I wrote a "translator" between the JSON representation called "Testtreiber",
the IHE ebXML representation using intermediate persistence objects.

Since the JSON representation has changed between 1.1.1 and 2.0.4 and I work on other topics I've  
removed the IHE wrappers from this project. To adapt it would need some days.

JAXB generated java classes from the  xml- and json-schemes are provided by mvn repositories. It avoids generating this boring and hardly never changing code:

* gen-ihe: Special communication objects for ihe using gen-ebrs objects.
* gen-ebrs: EbXml for document management as a base for IHE
* gen-hl7: HL7 schemes as a standard for health purposes with more than 2000 classes
* gen-fdv-json-testtreiber: JSON scheme for simple representation of IHE XML data
* gen-acml: Generated classes

## [gen-ihe](https://mvnrepository.com/artifact/org.fluentcodes.ihe/gen-ihe)

    <dependency>
       <groupId>org.fluentcodes.ihe</groupId>
       <artifactId>gen-ihe</artifactId>
       <version>1.0</version>
     </dependency>

## [contracts-ebRS](https://mvnrepository.com/artifact/org.fluentcodes.ihe/contracts-ebRS)

    <dependency>
       <groupId>org.fluentcodes.ihe</groupId>
       <artifactId>contracts-ebRS</artifactId>
       <version>3.0</version>
     </dependency>

## [gen-hl7](https://mvnrepository.com/artifact/org.fluentcodes.ihe/gen-hl7)

      <dependency>
          <groupId>org.fluentcodes.ihe</groupId>
          <artifactId>gen-hl7</artifactId>
          <version>3.1</version>
      </dependency>


## [Testtreiber](https://mvnrepository.com/artifact/org.fluentcodes.ihe/gen-fdv-json-testtreiber)

    <dependency>
        <groupId>org.fluentcodes.ihe</groupId>
        <artifactId>gen-fdv-json-testtreiber</artifactId>
        <version>2.0.4</version>
     </dependency>


## [gen-xacml](https://mvnrepository.com/artifact/org.fluentcodes.ihe/gen-xacml)
Policy access right schema.

    <dependency>
        <groupId>org.fluentcodes.ihe</groupId>
        <artifactId>gen-xacml</artifactId>
        <version>2.0.0</version>
     </dependency> 


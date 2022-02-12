# IHE Generated Stuff

I've started this project after working on "Digitale Gesundheitsakte" at Gematik,  
an IHE project in Germany. I wrote a "translator" between the JSON representation called "Testtreiber",
the IHE ebXML representation using intermediate persistence objects.

Since the JSON representation has changed between 1.1.1 and 2.0.4 and I work on other topics I've  
removed the IHE translator from this project.

The generated java code from the  xml- and json-schemes are still provided by mvn repositories.  
 It avoids generating this boring and hardly never changing code:
* gen-ebrs: EbXml for document management
* gen-hl7: HL7 schemes as a standard for health purposes
* gen-fdv-json-testtreiber: JSON scheme for simple IHE data

## [contracts-ebRS](https://mvnrepository.com/artifact/org.fluentcodes.ihe/)

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

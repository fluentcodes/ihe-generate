package org.fluentcodes.ihe.iti.metafields.extrinsicobjects;

import org.assertj.core.api.Assertions;
import org.fluentcodes.ihe.iti.metafields.classifications.AuthorRO;
import org.fluentcodes.tools.xpect.XpectJackson;
import org.fluentcodes.tools.xpect.XpectJaxb;
import org.junit.Test;

import java.util.List;

public class AuthorROTest {

    @Test
    public void testWithDocumentNoId() {
        DocumentEntryRO document = new DocumentEntryRO();
        document.setId("document");
        AuthorMetaSingle author = new AuthorMetaSingle(document);
        AuthorRO authorRO = new AuthorRO();
        authorRO.setId("test");
        authorRO.setAuthorInstitution(List.of("institution1", "institution2"));
        author.set(authorRO);
        Assertions.assertThat(author.get().getId()).isEqualTo("test");
        new XpectJackson<>().compareAsString(authorRO);
        new XpectJaxb<>().compareAsString(authorRO.createType());
    }
}

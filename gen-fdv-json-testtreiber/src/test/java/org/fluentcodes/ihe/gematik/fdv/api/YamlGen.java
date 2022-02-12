package org.fluentcodes.ihe.gematik.fdv.api;

import io.swagger.v3.oas.models.OpenAPI;
import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import io.swagger.v3.core.util.Yaml;

import static org.junit.Assert.assertNotNull;

public class YamlGen {
    @Test
    public void readSwaggerModels() throws Exception {
        OpenAPI oas = Yaml.mapper().readValue(new FileInputStream(new File("schema/testtreiber_fdv.yaml"))
                , OpenAPI.class);
        assertNotNull(oas);
    }
}

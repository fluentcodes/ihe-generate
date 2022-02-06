/**
 * Testtreiber ePA-Frontend des Versicherten
 * REST Schnittstelle einer Test-App fuer das ePA-Modul FdV
 *
 * The version of the OpenAPI document: 2.0.4
 * Contact: software-development@gematik.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.FindDirectoryRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDirectoryResponseDTO;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Testtreiber ePA-Frontend des Versicherten
 *
 * <p>REST Schnittstelle einer Test-App fuer das ePA-Modul FdV
 *
 * API tests for DirectoryApi
 */
public class DirectoryApiTest {


    private DirectoryApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://frontend.titus.ti-dienste.de", DirectoryApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Suche nach Leistungserbringerinstitutionen im Verzeichnisdienst
     *
     * Diese Operation führt eine Suchanfrage für Leistungserbringerinstitutionen im Verzeichnisdienst der TI in einer mit insurantId identifizierten Aktensession aus.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findHcpos1Test() {
        FindDirectoryRequestDTO findDirectoryRequestDTO = null;
        //FindDirectoryResponseDTO response = api.findHcpos1(findDirectoryRequestDTO);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Suche nach Kostenträgern im Verzeichnisdienst
     *
     * Diese Operation führt eine Suchanfrage für Kostenträger im Verzeichnisdienst der TI in einer mit insurantId identifizierten Aktensession aus.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findInsurances1Test() {
        FindDirectoryRequestDTO findDirectoryRequestDTO = null;
        //FindDirectoryResponseDTO response = api.findInsurances1(findDirectoryRequestDTO);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}

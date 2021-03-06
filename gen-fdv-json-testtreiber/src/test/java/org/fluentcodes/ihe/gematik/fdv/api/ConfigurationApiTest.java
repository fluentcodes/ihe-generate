/**
 * Testtreiber ePA-Frontend des Versicherten
 * REST Schnittstelle einer Test-App fuer das ePA-Modul FdV
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.ihe.gematik.fdv.model.ConfigurationEntry;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseDTO;
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
 * API tests for ConfigurationApi 
 */
public class ConfigurationApiTest {


    private ConfigurationApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://gematik.de/fdv", ConfigurationApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Gesamte Konfiguration lesen
     *
     * Umsetzung Operation I_FdV_Management::getConfiguration (A_18067); Liefert alle Konfigurationseintraege, die dem Filter entsprechen. Als Filter ist configurationEntryId moeglich.   Wird kein Filter angegeben, dann werden alle Eintraege aus der Konfiguration zurueckgegeben.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurationEntries1Test() {
        String uid = null;
        //List<ConfigurationEntry> response = api.getConfigurationEntries1(uid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Konfigurationseintrag aendern
     *
     * Umsetzung Operation I_FdV_Management::setConfiguration (A_18066); Setzt einen Konfigurationseintrag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConfigurationEntries1Test() {
        ConfigurationEntry configurationEntry = null;
        //ResponseDTO response = api.updateConfigurationEntries1(configurationEntry);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}

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

import org.fluentcodes.ihe.gematik.fdv.model.ProtocolResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RequestDTO;
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
 * API tests for UserApi 
 */
public class UserApiTest {


    private UserApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://gematik.de/fdv", UserApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Login Aktensession
     *
     * Umsetzung Operation I_FdV::login A_18045; Login in zwei Varianten; Falls die insurantID uebergeben wird, dann referenziert die insurantID die AUT-Identitaet des Nutzers, welche ueber eine eGK oder einen Signaturdienst (Konfigurationsparameter UseEGK) verfuegbar ist. Falls keine insurantID übergeben wird, dann wird eine PKCS12-Datei uebergeben. Das C.CH.AUT Zertifikat und der private Schluessel aus der PKCS12-Datei werden im Testtreiber genutzt (bspw. Signatur bei der Authentisierung und der Schluesselerzeugung mit SGD).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void login1Test() {
        RequestDTO requestDTO = null;
        //ProtocolResponseDTO response = api.login1(requestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Logout Aktensession
     *
     * Umsetzung Operation I_FdV::logout A_18046; Logout wird fuer eine per InsurantID (KVNR) referenzierte Identitaet ausgeloest.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logout1Test() {
        RequestDTO requestDTO = null;
        //ResponseDTO response = api.logout1(requestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}

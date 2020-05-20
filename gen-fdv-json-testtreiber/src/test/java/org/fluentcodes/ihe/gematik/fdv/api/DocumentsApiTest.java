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

import org.fluentcodes.ihe.gematik.fdv.model.DocumentsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDocumentsRequestDTO;
import org.fluentcodes.ihe.gematik.fdv.model.FindDocumentsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.ResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.RetrieveDocumentsResponseDTO;
import org.fluentcodes.ihe.gematik.fdv.model.StoreDocumentRequestDTO;
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
 * API tests for DocumentsApi 
 */
public class DocumentsApiTest {


    private DocumentsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://gematik.de/fdv", DocumentsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Dokumente aus dem Aktenkonto loeschen
     *
     * Umsetzung Operation I_FdV::deleteDocuments (A_18061); Loescht die Dokumente mit dem im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocuments1Test() {
        DocumentsRequestDTO documentsRequestDTO = null;
        //ResponseDTO response = api.deleteDocuments1(documentsRequestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Dokumente und Submission Sets in einem Aktenkonto finden
     *
     * Umsetzung Operation I_FdV::findDocuments (A_18059); Die fuer die Suchoperation zu verwendende Stored Query wird durch den Parameter vorgegeben. Falls dieser nicht angegeben ist, muss eine geeignete Stored Query gewaehlt werden.; Wenn die Suchparameter ein SubmissionSet adressieren, dann soll der Response die Metadaten der im SubmissionSet enthaltenen Dokumente (unter Beachtung ggf. zusätzlich angegebenener Suchkriterien zu Dokumenten) beinhalten.; Der Response enthält Metadaten zu Dokumenten aber nicht die Dokumente selbst.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findDocuments1Test() {
        FindDocumentsRequestDTO findDocumentsRequestDTO = null;
        //FindDocumentsResponseDTO response = api.findDocuments1(findDocumentsRequestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Dokumente aus Aktenkonto herunterladen
     *
     * Umsetzung Operation I_FdV::getDocuments (A_18060); Laedt die Dokumente mit den im Request angegebenen Ids aus dem Aktenkonto. Die Ids werden mittels findDocuments ermittelt.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveDocuments1Test() {
        DocumentsRequestDTO documentsRequestDTO = null;
        //RetrieveDocumentsResponseDTO response = api.retrieveDocuments1(documentsRequestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Dokumente in ein Aktenkonto laden
     *
     * Umsetzung Operation I_FdV::putDocuments (A_18058)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void storeDocuments1Test() {
        StoreDocumentRequestDTO storeDocumentRequestDTO = null;
        //ResponseDTO response = api.storeDocuments1(storeDocumentRequestDTO);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}

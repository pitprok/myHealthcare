/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.controllers;

import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pitpr
 */
public class HelperTest {

    public HelperTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of allergyJsonData method, of class Helper.
     */
    public void allergyJsonData() {
        System.out.println("JsonData");
        String jsonString = "{\"id\": \"fishallergy\", \"code\": {\"text\": \"Allergic to fresh fish. Tolerates canned fish\", \"coding\": [{\"code\": \"227037002\", \"system\": \"http://snomed.info/sct\", \"display\": \"Fish - dietary (substance)\"}]}, \"text\": {\"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">\\n      <p>allergy is to fresh fish. Tolerates canned fish</p>\\n      <p>recordedDate:2015-08-06T00:00:00-06:00</p>\\n      <p>substance:Fish - dietary (substance)</p>\\n    </div>\", \"status\": \"additional\"}, \"patient\": {\"reference\": \"Patient/example\"}, \"category\": [\"food\"], \"reaction\": [{\"severity\": \"severe\", \"manifestation\": [{\"coding\": [{\"code\": \"39579001\", \"system\": \"http://snomed.info/sct\", \"display\": \"Swelling\"}]}]}], \"recorder\": {\"reference\": \"Practitioner/example\"}, \"identifier\": [{\"value\": \"49476535\", \"system\": \"http://acme.com/ids/patients/risks\"}], \"criticality\": \"high\", \"recordedDate\": \"2015-08-06T15:37:31-06:00\", \"resourceType\": \"AllergyIntolerance\", \"clinicalStatus\": {\"coding\": [{\"code\": \"active\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\", \"display\": \"Active\"}]}, \"verificationStatus\": {\"coding\": [{\"code\": \"confirmed\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\", \"display\": \"Confirmed\"}]}}";
        Helper instance = new Helper();
        Map<String, String> result = instance.allergyJsonData(jsonString);
        assertEquals(new String("Swelling"),result.get("manifestation"));
        assertEquals("Fish - dietary (substance)", result.get("item"));
        assertEquals("high",result.get("criticality"));
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveItem method, of class Helper.
     */
    @Test
    public void testRetrieveItem() {
        System.out.println("retrieveItem");
        String jsonString ="{\"id\": \"fishallergy\", \"code\": {\"text\": \"Allergic to fresh fish. Tolerates canned fish\", \"coding\": [{\"code\": \"227037002\", \"system\": \"http://snomed.info/sct\", \"display\": \"Fish - dietary (substance)\"}]}, \"text\": {\"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">\\n      <p>allergy is to fresh fish. Tolerates canned fish</p>\\n      <p>recordedDate:2015-08-06T00:00:00-06:00</p>\\n      <p>substance:Fish - dietary (substance)</p>\\n    </div>\", \"status\": \"additional\"}, \"patient\": {\"reference\": \"Patient/example\"}, \"category\": [\"food\"], \"reaction\": [{\"severity\": \"severe\", \"manifestation\": [{\"coding\": [{\"code\": \"39579001\", \"system\": \"http://snomed.info/sct\", \"display\": \"Swelling\"}]}]}], \"recorder\": {\"reference\": \"Practitioner/example\"}, \"identifier\": [{\"value\": \"49476535\", \"system\": \"http://acme.com/ids/patients/risks\"}], \"criticality\": \"high\", \"recordedDate\": \"2015-08-06T15:37:31-06:00\", \"resourceType\": \"AllergyIntolerance\", \"clinicalStatus\": {\"coding\": [{\"code\": \"active\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\", \"display\": \"Active\"}]}, \"verificationStatus\": {\"coding\": [{\"code\": \"confirmed\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\", \"display\": \"Confirmed\"}]}}";
        String expResult = "Fish - dietary (substance)";
        String result = Helper.retrieveItem(jsonString);
        assertEquals(expResult, result);

    }

    /**
     * Test of retrieveReaction method, of class Helper.
     */
    public void testRetrieveManifestation() {
        System.out.println("retrieveReaction");
        String jsonString ="{  \"resourceType\": \"AllergyIntolerance\",  \"id\": \"fishallergy\",  \"text\": {    \"status\": \"additional\",    \"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">\\n      <p>allergy is to fresh fish. Tolerates canned fish</p>\\n      <p>recordedDate:2015-08-06T00:00:00-06:00</p>\\n      <p>substance:Fish - dietary (substance)</p>\\n    </div>\"  },  \"identifier\": [    {      \"system\": \"http://acme.com/ids/patients/risks\",      \"value\": \"49476535\"    }  ],  \"clinicalStatus\": {    \"coding\": [      {        \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",        \"code\": \"active\",        \"display\": \"Active\"      }    ]  },  \"verificationStatus\": {    \"coding\": [      {        \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\",        \"code\": \"confirmed\",        \"display\": \"Confirmed\"      }    ]  },  \"category\": [    \"food\"  ],  \"criticality\": \"high\",  \"code\": {    \"coding\": [      {        \"system\": \"http://snomed.info/sct\",        \"code\": \"227037002\",        \"display\": \"Fish - dietary (substance)\"      }    ],    \"text\": \"Allergic to fresh fish. Tolerates canned fish\"  },  \"reaction\": [    {            \"manifestation\": [        {          \"coding\": [            {              \"system\": \"http://snomed.info/sct\",              \"code\": \"39579001\",              \"display\": \"Swelling\"            }          ]        }      ],      \"severity\": \"severe\"    }  ],  \"patient\": {    \"reference\": \"Patient/example\"  },  \"recordedDate\": \"2015-08-06T15:37:31-06:00\",  \"recorder\": {    \"reference\": \"Practitioner/example\"  }}";
        String expResult = "Swelling";
        String result = Helper.retrieveManifestation(jsonString);
        assertEquals(expResult, result);

    }

}

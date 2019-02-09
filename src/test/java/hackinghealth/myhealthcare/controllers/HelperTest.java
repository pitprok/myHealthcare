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
    @Test
    public void testJsonData() {
        System.out.println("Cashew nuts");
        String jsonString = "{\"clinicalStatus\":{\"coding\":[{\"system\":\"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\"code\":\"active\",\"display\":\"Active\"}]},\"type\":\"allergy\",\"category\":\"food\",\"criticality\":\"high\",\"code\":{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"227493005\",\"display\":\"Cashew nuts\"}]},\"reaction\":[{\"manifestation\":[{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"39579001\",\"display\":\"Anaphylactic reaction\"}]}],\"severity\":\"severe\"}]}";
        Helper instance = new Helper();
        String expResult = "Cashew nuts";
        Map<String, String> result = instance.allergyJsonData(jsonString);
        assertEquals(expResult, result.get("item"));
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveItem method, of class Helper.
     */
    @Test
    public void testRetrieveItem() {
        System.out.println("retrieveItem");
        String jsonString = "{\"clinicalStatus\":{\"coding\":[{\"system\":\"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\"code\":\"active\",\"display\":\"Active\"}]},\"type\":\"allergy\",\"category\":\"food\",\"criticality\":\"high\",\"code\":{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"227493005\",\"display\":\"Cashew nuts\"}]},\"reaction\":[{\"manifestation\":[{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"39579001\",\"display\":\"Anaphylactic reaction\"}]}],\"severity\":\"severe\"}]}";
        String expResult = "Cashew nuts";
        String result = Helper.retrieveItem(jsonString);
        assertEquals(expResult, result);

    }

    /**
     * Test of retrieveReaction method, of class Helper.
     */
    @Test
    public void testRetrieveManifestation() {
        System.out.println("retrieveReaction");
        String jsonString = "{\"clinicalStatus\":{\"coding\":[{\"system\":\"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\",\"code\":\"active\",\"display\":\"Active\"}]},\"type\":\"allergy\",\"category\":\"food\",\"criticality\":\"high\",\"code\":{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"227493005\",\"display\":\"Cashew nuts\"}]},\"reaction\":[{\"manifestation\":[{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"39579001\",\"display\":\"Anaphylactic reaction\"}]}],\"severity\":\"severe\"}]}";
        String expResult = "Anaphylactic reaction";
        String result = Helper.retrieveManifestation(jsonString);
        assertEquals(expResult, result);

    }

}

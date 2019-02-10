/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import hackinghealth.myhealthcare.dao.PatientData;
import hackinghealth.myhealthcare.models.Allergy;
import hackinghealth.myhealthcare.models.AllergyEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pitpr
 */
@Controller
public class GeneralController {

    @Autowired
    PatientData patientData;

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/patient")
    public ModelAndView patient(ModelAndView modelAndView) {
        modelAndView.setViewName("patient");
        return modelAndView;
    }

    @RequestMapping(value = "/results")
    public ModelAndView patient(ModelAndView modelAndView, String fhircode) {

//        List<Allergy> array=patientData.selectAllergy("001");
        List<String> array = new ArrayList<>();
        array.add("{\"id\": \"fishallergy\", \"code\": {\"text\": \"Allergic to fresh fish. Tolerates canned fish\", \"coding\": [{\"code\": \"227037002\", \"system\": \"http://snomed.info/sct\", \"display\": \"Fish - dietary (substance)\"}]}, \"text\": {\"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">\\n      <p>allergy is to fresh fish. Tolerates canned fish</p>\\n      <p>recordedDate:2015-08-06T00:00:00-06:00</p>\\n      <p>substance:Fish - dietary (substance)</p>\\n    </div>\", \"status\": \"additional\"}, \"patient\": {\"reference\": \"Patient/example\"}, \"category\": [\"food\"], \"reaction\": [{\"severity\": \"severe\", \"manifestation\": [{\"coding\": [{\"code\": \"39579001\", \"system\": \"http://snomed.info/sct\", \"display\": \"Swelling\"}]}]}], \"recorder\": {\"reference\": \"Practitioner/example\"}, \"identifier\": [{\"value\": \"49476535\", \"system\": \"http://acme.com/ids/patients/risks\"}], \"criticality\": \"high\", \"recordedDate\": \"2015-08-06T15:37:31-06:00\", \"resourceType\": \"AllergyIntolerance\", \"clinicalStatus\": {\"coding\": [{\"code\": \"active\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\", \"display\": \"Active\"}]}, \"verificationStatus\": {\"coding\": [{\"code\": \"confirmed\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\", \"display\": \"Confirmed\"}]}}");
        array.add("{\"id\": \"medication\", \"code\": {\"coding\": [{\"code\": \"7980\", \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\", \"display\": \"Penicillin G\"}]}, \"text\": {\"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: medication</p><p><b>clinicalStatus</b>: Active <span>(Details : {http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical code 'active' = 'Active', given as 'Active'})</span></p><p><b>verificationStatus</b>: Unconfirmed <span>(Details : {http://terminology.hl7.org/CodeSystem/allergyintolerance-verification code 'unconfirmed' = 'Unconfirmed', given as 'Unconfirmed'})</span></p><p><b>category</b>: medication</p><p><b>criticality</b>: high</p><p><b>code</b>: Penicillin G <span>(Details : {RxNorm code '7980' = 'Penicillin G', given as 'Penicillin G'})</span></p><p><b>patient</b>: <a>Patient/example</a></p><p><b>recordedDate</b>: Mar 1, 2010</p><p><b>recorder</b>: <a>Practitioner/13</a></p><h3>Reactions</h3><table><tr><td>-</td><td><b>Manifestation</b></td></tr><tr><td>*</td><td>Hives <span>(Details : {SNOMED CT code '247472004' = 'Weal', given as 'Hives'})</span></td></tr></table></div>\", \"status\": \"generated\"}, \"patient\": {\"reference\": \"Patient/example\"}, \"category\": [\"medication\"], \"reaction\": [{\"manifestation\": [{\"coding\": [{\"code\": \"247472004\", \"system\": \"http://snomed.info/sct\", \"display\": \"Hives\"}]}]}], \"recorder\": {\"reference\": \"Practitioner/13\"}, \"criticality\": \"high\", \"recordedDate\": \"2010-03-01\", \"resourceType\": \"AllergyIntolerance\", \"clinicalStatus\": {\"coding\": [{\"code\": \"active\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\", \"display\": \"Active\"}]}, \"verificationStatus\": {\"coding\": [{\"code\": \"unconfirmed\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\", \"display\": \"Unconfirmed\"}]}}");
//        String jsonString = "{\"id\": \"fishallergy\", \"code\": {\"text\": \"Allergic to fresh fish. Tolerates canned fish\", \"coding\": [{\"code\": \"227037002\", \"system\": \"http://snomed.info/sct\", \"display\": \"Fish - dietary (substance)\"}]}, \"text\": {\"div\": \"<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\">\\n      <p>allergy is to fresh fish. Tolerates canned fish</p>\\n      <p>recordedDate:2015-08-06T00:00:00-06:00</p>\\n      <p>substance:Fish - dietary (substance)</p>\\n    </div>\", \"status\": \"additional\"}, \"patient\": {\"reference\": \"Patient/example\"}, \"category\": [\"food\"], \"reaction\": [{\"severity\": \"severe\", \"manifestation\": [{\"coding\": [{\"code\": \"39579001\", \"system\": \"http://snomed.info/sct\", \"display\": \"Swelling\"}]}]}], \"recorder\": {\"reference\": \"Practitioner/example\"}, \"identifier\": [{\"value\": \"49476535\", \"system\": \"http://acme.com/ids/patients/risks\"}], \"criticality\": \"high\", \"recordedDate\": \"2015-08-06T15:37:31-06:00\", \"resourceType\": \"AllergyIntolerance\", \"clinicalStatus\": {\"coding\": [{\"code\": \"active\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical\", \"display\": \"Active\"}]}, \"verificationStatus\": {\"coding\": [{\"code\": \"confirmed\", \"system\": \"http://terminology.hl7.org/CodeSystem/allergyintolerance-verification\", \"display\": \"Confirmed\"}]}}";
//        Helper instance = new Helper();
//        Map<String, String> result = instance.allergyJsonData(jsonString);
//        System.out.println(result.get("item"));
//        System.out.println(result.get("manifestation"));
//        System.out.println(result.get("criticality"));

//        System.out.println(array.get(0).getAllergydata());
//        System.out.println(array.get(1).getAllergydata());
        List<AllergyEntity> allergyArray = new ArrayList<>();
        for (String i : array) {
//            String allergyData=i.getAllergydata();
            Map<String, String> map = Helper.allergyJsonData(i);
            AllergyEntity allergyEntity = new AllergyEntity(map.get("item"), map.get("manifestation"), map.get("criticality"));
            System.out.println(allergyEntity);
            allergyArray.add(allergyEntity);
        }
        modelAndView.setViewName("results");
        modelAndView.addObject("allergy", allergyArray);
        return modelAndView;
    }

}

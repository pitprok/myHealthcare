/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pitpr
 */
@Controller
public class GeneralController {
    
    @RequestMapping(value="/")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
    @RequestMapping(value="/patient")
    public ModelAndView patient(ModelAndView modelAndView){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString="{\"resourceType\" : \"Patient\",\"id\" : \"f001\",\"meta\" : {\"versionId\" : \"1\",\"lastUpdated\" : \"2019-01-13T15:33:41.499Z\"},\"text\" : {\"status\" : \"generated\",\"div\" : \"<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: f001</p><p><b>identifier</b>: 738472983 (USUAL), ?? (USUAL)</p><p><b>active</b>: true</p><p><b>name</b>: Pieter van de Heuvel </p><p><b>telecom</b>: ph: 0648352638(MOBILE), p.heuvel@gmail.com(HOME)</p><p><b>gender</b>: male</p><p><b>birthDate</b>: Nov 17, 1944</p><p><b>deceased</b>: false</p><p><b>address</b>: Van Egmondkade 23 Amsterdam 1024 RJ NLD (HOME)</p><p><b>maritalStatus</b>: Getrouwd <span>(Details : {http://terminology.hl7.org/CodeSystem/v3-MaritalStatus code 'M' = 'Married', given as 'Married'})</span></p><p><b>multipleBirth</b>: true</p><h3>Contacts</h3><table><tr><td>-</td><td><b>Relationship</b></td><td><b>Name</b></td><td><b>Telecom</b></td></tr><tr><td>*</td><td>Emergency Contact <span>(Details : {http://terminology.hl7.org/CodeSystem/v2-0131 code 'C' = 'Emergency Contact)</span></td><td>Sarah Abels </td><td>ph: 0690383372(MOBILE)</td></tr></table><h3>Communications</h3><table><tr><td>-</td><td><b>Language</b></td><td><b>Preferred</b></td></tr><tr><td>*</td><td>Nederlands <span>(Details : {urn:ietf:bcp:47 code 'nl' = 'Dutch', given as 'Dutch'})</span></td><td>true</td></tr></table><p><b>managingOrganization</b>: <a>Burgers University Medical Centre</a></p></div>\"},\"identifier\" : [{\"use\" : \"usual\",\"system\" : \"urn:oid:2.16.840.1.113883.2.4.6.3\",\"value\" : \"738472983\"},{\"use\" : \"usual\",\"system\" : \"urn:oid:2.16.840.1.113883.2.4.6.3\"}],\"active\" : true,\"name\" : [{\"use\" : \"usual\",\"family\" : \"van de Heuvel\",\"given\" : [\"Pieter\"],\"suffix\" : [\"MSc\"]}],\"telecom\" : [{\"system\" : \"phone\",\"value\" : \"0648352638\",\"use\" : \"mobile\"},{\"system\" : \"email\",\"value\" : \"p.heuvel@gmail.com\",\"use\" : \"home\"}],\"gender\" : \"male\",\"birthDate\" : \"1944-11-17\",\"deceasedBoolean\" : false,\"address\" : [{\"use\" : \"home\",\"line\" : [\"Van Egmondkade 23\"],\"city\" : \"Amsterdam\",\"postalCode\" : \"1024 RJ\",\"country\" : \"NLD\"}],\"maritalStatus\" : {\"coding\" : [{\"system\" : \"http://terminology.hl7.org/CodeSystem/v3-MaritalStatus\",\"code\" : \"M\",\"display\" : \"Married\"}],\"text\" : \"Getrouwd\"},\"multipleBirthBoolean\" : true,\"contact\" : [{\"relationship\" : [{\"coding\" : [{\"system\" : \"http://terminology.hl7.org/CodeSystem/v2-0131\",\"code\" : \"C\"}]}],\"name\" : {\"use\" : \"usual\",\"family\" : \"Abels\",\"given\" : [\"Sarah\"]},\"telecom\" : [{\"system\" : \"phone\",\"value\" : \"0690383372\",\"use\" : \"mobile\"}]}],\"communication\" : [{\"language\" : {\"coding\" : [{\"system\" : \"urn:ietf:bcp:47\",\"code\" : \"nl\",\"display\" : \"Dutch\"}],\"text\" : \"Nederlands\"},\"preferred\" : true}],\"managingOrganization\" : {\"reference\" : \"Organization/f001\",\"display\" : \"Burgers University Medical Centre\"}}";
        modelAndView.setViewName("patient");
        return modelAndView;
    }
    
}

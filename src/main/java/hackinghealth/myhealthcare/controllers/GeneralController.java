/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import hackinghealth.myhealthcare.dao.PatientData;
import hackinghealth.myhealthcare.models.Allergy;
import java.util.ArrayList;
import java.util.List;
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
    
    @RequestMapping(value="/")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
    @RequestMapping(value="/conditions")
    public ModelAndView patient(ModelAndView modelAndView,String fhircode){

        List<Allergy> array=patientData.selectAllergy("001");
        
        modelAndView.setViewName("patient");
        modelAndView.addObject("allergy",array);
        return modelAndView;
    }
    
}

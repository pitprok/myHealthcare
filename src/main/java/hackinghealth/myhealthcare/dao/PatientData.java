/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.dao;

import hackinghealth.myhealthcare.models.Allergy;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pitpr
 */
@Repository
public class PatientData {

    @PersistenceContext
    private EntityManager em;

    public List<Allergy> selectAllergy(String fhircode) {
        System.out.println(fhircode);
        String sql = "SELECT * FROM allergy,patient WHERE allergy.patient_id=patient.id AND patient.fhircode='"+fhircode+"'";
        System.out.println(sql);
        List<Allergy> allergyList = (List<Allergy>) this.em.createNativeQuery(sql, Allergy.class).getResultList();
        return allergyList;
    }
}

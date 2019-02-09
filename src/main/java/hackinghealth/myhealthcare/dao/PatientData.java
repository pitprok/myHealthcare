/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author pitpr
 */
@Repository
public class PatientData {
    
    
//    @PersistenceContext
//	private EntityManager em;
//	
//	public List<Location> selectLocation(String locationCode) {
//		System.out.println(locationCode);
//		String sql = "SELECT * FROM location where json_CONTAINS(location_json, '{\"location_code\" : \""+locationCode+"\"}')";
//		System.out.println(sql);
//		List<Location> locationList = (List<Location>) this.em.createNativeQuery(sql, Location.class).getResultList();
//		return locationList;
//	}
}

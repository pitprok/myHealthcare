/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinghealth.myhealthcare.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pitpr
 */
@Entity
@Table(name = "allergy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Allergy.findAll", query = "SELECT a FROM Allergy a")
    , @NamedQuery(name = "Allergy.findById", query = "SELECT a FROM Allergy a WHERE a.id = :id")
    , @NamedQuery(name = "Allergy.findByPatientId", query = "SELECT a FROM Allergy a WHERE a.patientId = :patientId")})
public class Allergy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "patient_id")
    private String patientId;
    @Lob
    @Size(max = 1073741824)
    @Column(name = "allergydata")
    private String allergydata;

    public Allergy() {
    }

    public Allergy(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAllergydata() {
        return allergydata;
    }

    public void setAllergydata(String allergydata) {
        this.allergydata = allergydata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Allergy)) {
            return false;
        }
        Allergy other = (Allergy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hackinghealth.myhealthcare.models.Allergy[ id=" + id + " ]";
    }
    
}

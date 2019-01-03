/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author BOSS
 */
@Entity
public class AvailabilityType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statut;
    private String sexe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
        private int maxGuest;
    private boolean petsAccepted;
    private boolean smokerAccepted;
    private boolean presenceEnfant;

    public AvailabilityType() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public boolean isPetsAccepted() {
        return petsAccepted;
    }

    public void setPetsAccepted(boolean petsAccepted) {
        this.petsAccepted = petsAccepted;
    }

    public boolean isSmokerAccepted() {
        return smokerAccepted;
    }

    public void setSmokerAccepted(boolean smokerAccepted) {
        this.smokerAccepted = smokerAccepted;
    }

    public boolean isPresenceEnfant() {
        return presenceEnfant;
    }

    public void setPresenceEnfant(boolean presenceEnfant) {
        this.presenceEnfant = presenceEnfant;
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
        if (!(object instanceof AvailabilityType)) {
            return false;
        }
        AvailabilityType other = (AvailabilityType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AvailabilityType{" + "id=" + id + ", statut=" + statut + ", sexe=" + sexe + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", maxGuest=" + maxGuest + ", petsAccepted=" + petsAccepted + ", smokerAccepted=" + smokerAccepted + ", presenceEnfant=" + presenceEnfant + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author BOSS
 */
@Entity
public class Apropos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean presenceEnfant;
    private boolean presenceAnimaux;
    private boolean Smoker;
    @ManyToOne
    private Langue langue;
    @ManyToOne
    private CentreInteret centreInteret;

    public Apropos() {
    }

    public boolean isPresenceEnfant() {
        return presenceEnfant;
    }

    public void setPresenceEnfant(boolean presenceEnfant) {
        this.presenceEnfant = presenceEnfant;
    }

    public boolean isPresenceAnimaux() {
        return presenceAnimaux;
    }

    public void setPresenceAnimaux(boolean presenceAnimaux) {
        this.presenceAnimaux = presenceAnimaux;
    }

    public boolean isSmoker() {
        return Smoker;
    }

    public void setSmoker(boolean Smoker) {
        this.Smoker = Smoker;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public CentreInteret getCentreInteret() {
        return centreInteret;
    }

    public void setCentreInteret(CentreInteret centreInteret) {
        this.centreInteret = centreInteret;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Apropos)) {
            return false;
        }
        Apropos other = (Apropos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Apropos{" + "id=" + id + ", presenceEnfant=" + presenceEnfant + ", presenceAnimaux=" + presenceAnimaux + ", Smoker=" + Smoker + ", langue=" + langue + ", centreInteret=" + centreInteret + '}';
    }

    
}

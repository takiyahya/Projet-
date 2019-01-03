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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author BOSS
 */
@Entity
public class Voyage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String LieuDestination;
    private String LieuDepart;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateArrivee;
    private int nbrPersonne;
    private boolean accepteddemande;
    @ManyToOne
    private TypeHebergement typeHebergement;
    @ManyToOne
    private Hote traveler;
    @ManyToOne
    private Hote host;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLieuDestination() {
        return LieuDestination;
    }

    public void setLieuDestination(String LieuDestination) {
        this.LieuDestination = LieuDestination;
    }

    public String getLieuDepart() {
        return LieuDepart;
    }

    public void setLieuDepart(String LieuDepart) {
        this.LieuDepart = LieuDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public int getNbrPersonne() {
        return nbrPersonne;
    }

    public void setNbrPersonne(int nbrPersonne) {
        this.nbrPersonne = nbrPersonne;
    }

    public Hote getTraveler() {
        return traveler;
    }

    public void setTraveler(Hote traveler) {
        this.traveler = traveler;
    }

    public TypeHebergement getTypeHebergement() {
        return typeHebergement;
    }

    public void setTypeHebergement(TypeHebergement typeHebergement) {
        this.typeHebergement = typeHebergement;
    }

    public Hote getHost() {
        return host;
    }

    public void setHost(Hote host) {
        this.host = host;
    }

    public boolean isAccepteddemande() {
        return accepteddemande;
    }

    public void setAccepteddemande(boolean accepteddemande) {
        this.accepteddemande = accepteddemande;
    }

    
    public Voyage() {
    }

    public Voyage(String LieuDestination, String LieuDepart, Date dateArrivee, int nbrPersonne) {
        this.LieuDestination = LieuDestination;
        this.LieuDepart = LieuDepart;
        this.dateArrivee = dateArrivee;
        this.nbrPersonne = nbrPersonne;
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
        if (!(object instanceof Voyage)) {
            return false;
        }
        Voyage other = (Voyage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Voyage[ id=" + id + " ]";
    }

}

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
public class Demande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Hote hoteSource;
    @ManyToOne
    private Hote hoteDestinataire;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datedemande;
    private boolean isAccepted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hote getHoteSource() {
        return hoteSource;
    }

    public void setHoteSource(Hote hoteSource) {
        this.hoteSource = hoteSource;
    }

    public Hote getHoteDestinataire() {
        return hoteDestinataire;
    }

    public void setHoteDestinataire(Hote hoteDestinataire) {
        this.hoteDestinataire = hoteDestinataire;
    }

    public Date getDatedemande() {
        return datedemande;
    }

    public void setDatedemande(Date datedemande) {
        this.datedemande = datedemande;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Demande() {
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
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Demande{" + "id=" + id + ", hoteSource=" + hoteSource + ", hoteDestinataire=" + hoteDestinataire + ", datedemande=" + datedemande + ", isAccepted=" + isAccepted + '}';
    }

}

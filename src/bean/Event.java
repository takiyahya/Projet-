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
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String event;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebutEvent;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinEvent;
    private String lieu;
    private String description;
    @ManyToOne
    private Hote organisateur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDateDebutEvent() {
        return dateDebutEvent;
    }

    public void setDateDebutEvent(Date dateDebutEvent) {
        this.dateDebutEvent = dateDebutEvent;
    }

    public Date getDateFinEvent() {
        return dateFinEvent;
    }

    public void setDateFinEvent(Date dateFinEvent) {
        this.dateFinEvent = dateFinEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Hote getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(Hote organisateur) {
        this.organisateur = organisateur;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Event() {
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
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Events[ id=" + id + " ]";
    }

}

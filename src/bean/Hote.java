/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author BOSS
 */
@Entity
public class Hote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String login;
    private String nom;
    private String prenom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    private String Email;
    private String sexe;
    private String Tel;
    private String password;
    private String apropos;
    private String adresse;
    @OneToOne
    private Pays payshote;
    @OneToOne
    private AvailabilityType available;
//    private int maxGuest;
//    private boolean petsAccepted;
//    private boolean smokerAccepted;
//    private boolean presenceEnfant;

    public Pays getPayshote() {
        return payshote;
    }

    public void setPayshote(Pays payshote) {
        this.payshote = payshote;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApropos() {
        return apropos;
    }

    public void setApropos(String apropos) {
        this.apropos = apropos;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public AvailabilityType getAvailable() {
        return available;
    }

    public void setAvailable(AvailabilityType available) {
        this.available = available;
    }

    public Hote() {
    }

    public Hote(String login, String nom, String prenom, Date dateNaissance, String Email, String sexe, String Tel, String adresse, String password, Pays payshote) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.Email = Email;
        this.sexe = sexe;
        this.Tel = Tel;
        this.adresse = adresse;
        this.password = password;
        this.payshote = payshote;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hote other = (Hote) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hote{" + "login=" + login + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", Email=" + Email + ", sexe=" + sexe + ", Tel=" + Tel + ", password=" + password + ", apropos=" + apropos + ", adresse=" + adresse + ", payshote=" + payshote + ", available=" + available + '}';
    }

}

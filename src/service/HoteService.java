/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AvailabilityType;
import bean.Hote;
import util.Session;

/**
 *
 * @author BOSS
 */
public class HoteService extends AbstractFacade<Hote> {

    AvailabilityTypeService availabilityTypeService = new AvailabilityTypeService();
    AvailabilityType availabilityType;

    public HoteService() {
        super(Hote.class);
    }

    public int creerHote(Hote hote) {
        create(hote);
        return 1;
    }

    public int seConnecter(Hote hote) {
        Hote loadedUser = find(hote.getLogin());
        if (loadedUser == null) {
            return -1;
        } else if (!loadedUser.getPassword().equals(hote.getPassword())) {
            return -2;
        } else {
            Session.setAttribut(hote, "connected");
            return 1;
        }
    }

    public int editHote(Hote hote) {

        edit(hote);
        return 1;
    }

    
 
        

    }
    
//    public Hote creerHote(String login, String nom, String prenom, Date dateNaissance, String Email, String sexe, String Tel, String Adresse, String password) {
//        Hote hote = new Hote();
//        hote.setLogin(login);
//        hote.setPassword(password);
//        hote.setNom(nom);
//        hote.setPrenom(prenom);
//        hote.setDateNaissance(dateNaissance);
//        hote.setEmail(Email);
//        hote.setSexe(sexe);
//        hote.setTel(Tel);
//        hote.setAdresse(Adresse);
//
//        create(hote);
//        return hote;
//
//    }
//}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Pays;

/**
 *
 * @author BOSS
 */
public class PaysService extends AbstractFacade<Pays> {

    public PaysService() {
        super(Pays.class);
    }

//    public Pays createPays(String pays){
//        Pays country = new Pays(pays);
//        
//        create(country);
//        return country
    public Pays findbyPays(String nom) {
        String query = "SELECT p FROM Pays p WHERE p.nom='" + nom + "'";
        return (Pays) getEntityManager().createQuery(query).getSingleResult();

    }

}

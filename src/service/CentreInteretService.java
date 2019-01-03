/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CentreInteret;
import bean.Pays;

/**
 *
 * @author BOSS
 */
public class CentreInteretService extends AbstractFacade<CentreInteret>{

    public CentreInteretService(Class<CentreInteret> entityClass) {
        super(CentreInteret.class);
    }
       public CentreInteret createCentreInteret(String centreinteret){
        CentreInteret CI = new CentreInteret();
        CI.setCentreinteret(centreinteret);
        create(CI);
        return CI;
        
}
}
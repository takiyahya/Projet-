/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AvailabilityType;
import bean.Hote;
import java.util.Date;
import util.Session;

/**
 *
 * @author BOSS
 */
public class AvailabilityTypeService extends AbstractFacade<AvailabilityType>{
    
    public AvailabilityTypeService() {
        super(AvailabilityType.class);
    }
    
        public void createavailabilitytype(String statut,String sexe, Date dateDebut,Date dateFun) {

        AvailabilityType availabilityType = new AvailabilityType();
        availabilityType.setStatut(statut);
        availabilityType.setSexe(sexe);
        availabilityType.setDateDebut(new Date());
        availabilityType.setDateFin(new Date());
        create(availabilityType);
        
       Session.getAttribut("connected");

}
}
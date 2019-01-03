/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Demande;
import bean.Hote;
import java.util.Date;

/**
 *
 * @author BOSS
 */
public class DemandeService extends AbstractFacade<Demande> {

    Demande demande = new Demande();

    public DemandeService() {
        super(Demande.class);
    }

    public Demande createDemande(Hote hoteSource, Hote hoteDestinataire, Date datedemande) {
        demande.setHoteDestinataire(hoteDestinataire);
        demande.setDatedemande(datedemande);
        demande.setHoteSource(hoteSource);

        create(demande);
        return demande;
    }

    public int repondreDemande() {
        if (demande == null) {
            return -1;
        } else {
            demande.setIsAccepted(true);
        }
        return 1;
    }
}

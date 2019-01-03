/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Apropos;

/**
 *
 * @author BOSS
 */
public class AproposService extends AbstractFacade<Apropos> {

    public AproposService() {
        super(Apropos.class);
    }

    public Apropos creerApropos() {
        Apropos a = new Apropos();
        create(a);

        return a;
    }

}

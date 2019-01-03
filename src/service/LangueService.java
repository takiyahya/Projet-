/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Langue;

/**
 *
 * @author BOSS
 */
public class LangueService extends AbstractFacade<Langue> {

    public LangueService() {
        super(Langue.class);
    }

    public Langue createLangue(String langue) {
        Langue languague = new Langue();
        languague.setLangue(langue);
        create(languague);
        return languague;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Event;
import java.util.Date;

/**
 *
 * @author BOSS
 */
public class EventService extends AbstractFacade<Event> {

    public EventService() {
        super(Event.class);
    }

    public Event createEvent(Event evenement) {
//        Event evenement = new Event();
//        evenement.setEvent(event);
//        evenement.setDateDebutEvent(dateDebutEvent);
//        evenement.setDateFinEvent(dateFinEvent);
//        evenement.setLieu(lieu);

        create(evenement);
        return evenement;

    }
}

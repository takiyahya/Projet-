/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Event;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author BOSS
 */
public class EventHelper extends AbstractHelper<Event>{
    private static AbstractHelperItem[] titres;
    
    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("Evenement  ", "event"),
            new AbstractHelperItem("Date Debut", "dateDebutEvent"),
            new AbstractHelperItem("Date FIn", "dateFinEvent"),
            new AbstractHelperItem("Lieu", "Lieu")
        
        };
         
        }
    public EventHelper( JTable jTable, List<Event> list) {
        super(titres, jTable, list);
    }
     public EventHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public EventHelper( JTable jTable) {
        super(titres, jTable);
    }
}

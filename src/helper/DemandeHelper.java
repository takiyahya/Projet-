/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Demande;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author BOSS
 */
public class DemandeHelper extends AbstractHelper<Demande>{
    private static AbstractHelperItem[] titres;
    
    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("De", "hoteSource"),
            new AbstractHelperItem("Date ", "datedemande"),
        
        };
         
        }
    public DemandeHelper( JTable jTable, List<Demande> list) {
        super(titres, jTable, list);
    }
     public DemandeHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public DemandeHelper( JTable jTable) {
        super(titres, jTable);
    }
}

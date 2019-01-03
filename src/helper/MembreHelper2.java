/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Hote;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author BOSS
 */
public class MembreHelper2 extends AbstractHelper<Hote> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("NOM", "nom"),
        //    new AbstractHelperItem("Availability Type", "available"),
        };

    }

    public MembreHelper2(JTable jTable, List<Hote> list) {
        super(titres, jTable, list);
    }

    public MembreHelper2(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public MembreHelper2(JTable jTable) {
        super(titres, jTable);
    }
}

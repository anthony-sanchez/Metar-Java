/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.main;

import fr.epsi.ihm.MetarControler;
import fr.epsi.ihm.MetarView;

/**
 *
 * @author Antho
 */
public class Main {

    public static void main(String[] args) {
        MetarControler mc = new MetarControler();
        MetarView mv = new MetarView(mc);
        mc.setMview(mv);
        mv.setVisible(true);
    }
}

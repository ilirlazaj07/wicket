/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.senseisrl.test.block;

import it.senseisrl.entities.Istanza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sensei
 */
public class Test {

    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(new Istanza(4, "K"));
        lista.add(new Istanza(4, "5"));
        
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            
        }

    }

}

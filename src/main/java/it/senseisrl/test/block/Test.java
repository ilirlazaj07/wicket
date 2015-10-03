/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.senseisrl.test.block;

import it.senseisrl.entities.Istanza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Sensei
 */
public class Test {

    public static void main(String[] args) {
        List<Istanza> lista = new ArrayList();
        lista.add(new Istanza(4, "K"));
        lista.add(new Istanza(4, "5"));

        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            Istanza next = null;
            try {
                next = (Istanza) iterator.next();
            } catch (Exception e) {
                System.err.println(e);
            }
            System.out.println(next);
            List<String> strings = new ArrayList<>();
            unsafeAdd(strings, 42);

        }
                
        MiaMapImpl mmi = new MiaMapImpl();
        mmi.put(2, "m");
        
        Map m = new HashMap();
        
        m = mmi;
        
        System.out.println(m.get(2));
        
        System.out.println(mmi.isEmpty());
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    private static int getEquels(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object obj : s1) {
            if (s2.contains(obj)) {
                result++;
            }
        }

        return result;
    }
}

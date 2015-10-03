
package it.senseisrl.wicketapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.Component;

public class Navigazione extends WebPage{
    private Component header;
    
    public Navigazione(){
        add(new Label("ha", "Seconda Pagina"));
        header = new Header("headerPanel");
        add(header);
    }
}

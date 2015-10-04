package it.senseisrl.wicketapp;

import it.senseisrl.entities.Istanza;
import javax.servlet.http.HttpSession;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;
import org.apache.wicket.request.cycle.RequestCycle;

/**
 *
 * @author Sensei
 */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 123L;
    TextField username;

    public HomePage() {
        Istanza istanza = new Istanza(1, "Valore primo");
        
        istanza.setSibling(new Istanza(2, "Sibling"));
       
        setDefaultModel(new CompoundPropertyModel<>(istanza));

        IModel<String> modello = new Model("");
        IModel<String> modell1 = new Model("");
        username = new TextField("username", modello);
        TextField password = new TextField("password", modell1);

        //  add(new Label("mess", "Ciao"));
        //    IModel<String> modello = new Model("");
        Label label = new Label("sibling.codice_istanza");
        add(label);
        //   Label label1 = new Label("mia", modello);
        //   add(label1);
        //    Link<Object> link = new Link<Object>("link") {
        //  @Override
        //   public void onClick() {
        //      setResponsePage(Navigazione.class);
        //   }
        // };
        //     add(link);
        // 
        istanza.setCodice_istanza(":D");
        istanza.setCodice_istanza("Testo");
        Form<Void> form = new Form<Void>("form") {

            @Override
            public void onSubmit() {
                String username1 = username.getModelObject().toString();
                System.out.println(username1);
                if (username1.equals("admin")) {
                    HttpSession session = ((ServletWebRequest) RequestCycle.get()
                    .getRequest()).getContainerRequest().getSession();
                    session.setAttribute("atr", ";)");
                    System.out.println(session.getAttribute("atr"));
                    this.setResponsePage(Ereditata.class);
                }
            }

            @Override
            public void onInitialize() {
                super.onInitialize();
                System.out.println("Form Inizializzata");
            }
        };
        form.add(username);
        form.add(password);
        add(form);
        HeaderPanel panelloHeader = new HeaderPanel("panelloHeader");
        add(panelloHeader);

    }

}

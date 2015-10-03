
package it.senseisrl.wicketapp;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class FormCustom extends Form {

    private String username;
    private String password;
    private String esito;

    
    public FormCustom(String id) {
        super(id);
        setDefaultModel(new CompoundPropertyModel<>(this));
        add(new TextField("username"));
        add(new TextField("password"));
        add(new Label("esito"));
    }

    @Override
    public final void onSubmit() {
        if (username.equals("admin")) {
            setEsito("Accesso Bloccato");
        } else {
            setEsito("OK !");
        }
    }

    public String getUsernameField() {
        return username;
    }

    public void setUsernameField(String usernameField) {
        this.username = usernameField;
    }

    public String getPasswordField() {
        return password;
    }

    public void setPasswordField(String passwordField) {
        this.password = passwordField;
    }

    public String getEsito() {
        return esito;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }

}

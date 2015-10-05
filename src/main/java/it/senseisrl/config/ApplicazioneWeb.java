package it.senseisrl.config;

import it.senseisrl.wicketapp.HomePage;
import org.apache.wicket.Page;
import org.apache.wicket.authentication.*;
import org.apache.wicket.markup.html.WebPage;

public class ApplicazioneWeb extends AuthenticatedWebApplication {

    public ApplicazioneWeb() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {

    }

    @Override
    protected Class<? extends AuthenticatedWebSession> getWebSessionClass() {
        return MyAuthenticatedWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return MySignInPage.class;
    }

}


package it.senseisrl.wicketapp;
import org.apache.wicket.Component;
import org.apache.wicket.DefaultMarkupIdGenerator;
import org.apache.wicket.IMarkupIdGenerator;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class ApplicazioneWeb extends WebApplication {
    
    public  ApplicazioneWeb(){
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
    
    @Override
    protected void init(){
     
    }
}

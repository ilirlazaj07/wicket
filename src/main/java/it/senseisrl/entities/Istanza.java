package it.senseisrl.entities;

import java.io.Serializable;


public class Istanza{
    private Integer id_istanza;
    private String codice_istanza;
    private Istanza sibling;
    
    public Istanza(int id, String codice){
    this.id_istanza = id;
    this.codice_istanza = codice;
    }

    public Integer getId_istanza() {
        return id_istanza;
    }

    public void setId_istanza(Integer id_istanza) {
        this.id_istanza = id_istanza;
    }

    public String getCodice_istanza() {
        return codice_istanza;
    }

    public void setCodice_istanza(String codice_istanza) {
        this.codice_istanza = codice_istanza;
    }

    public Istanza getSibling() {
        return sibling;
    }

    public void setSibling(Istanza sibling) {
        this.sibling = sibling;
    }
        
}

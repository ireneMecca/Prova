package it.unibas.agenzia.modello;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;


@Getter

public class Agenzia {
    
    private String codiceUnivoco;
    private String nomeAgenzia;
    private String citta;
    private String prenotazioneOnline;
    
    private List<Pacchetto> listaPacchetti = new ArrayList<>();

    public Agenzia(String codiceUnivoco, String nomeAgenzia, String citta, String prenotazioneOnline) {
        this.codiceUnivoco = codiceUnivoco;
        this.nomeAgenzia = nomeAgenzia;
        this.citta = citta;
        this.prenotazioneOnline = prenotazioneOnline;
    }

    public void addPacchetto (Pacchetto pacchetto) {
        this.listaPacchetti.add(pacchetto);
    }
    
    
}

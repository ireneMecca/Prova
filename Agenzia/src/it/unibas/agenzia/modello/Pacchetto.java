package it.unibas.agenzia.modello;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pacchetto {
    
    private String destinazione;
    private double importo;
    private LocalDate data;
    private int durata;
    private String tipologia;
    
    
    
    

}

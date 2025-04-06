package it.unibas.agenzia.persistenza;

import it.unibas.agenzia.modello.Agenzia;
import it.unibas.agenzia.modello.Costanti;
import it.unibas.agenzia.modello.Pacchetto;
import it.unibas.agenzia.modello.SistemaInformatico;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;


public class DAOSistemaMock implements IDAOSistema {

    @Override
    public SistemaInformatico carica(InputStream file) throws DAOException {
        SistemaInformatico sistema = new SistemaInformatico();

        Agenzia agenzia1 = new Agenzia("123", "Charon", "Bangkok", Costanti.NO_ONLINE);
        agenzia1.addPacchetto(new Pacchetto("Roma", 1500, LocalDate.of(2025, Month.APRIL, 28), 10, Costanti.TIPOLOGIA_CITTA));
        agenzia1.addPacchetto(new Pacchetto("Chiang Mai", 300, LocalDate.of(2025, Month.APRIL, 8), 3, Costanti.TIPOLOGIA_CITTA));
        agenzia1.addPacchetto(new Pacchetto("Rimini", 800, LocalDate.of(2025, Month.JANUARY, 8), 5, Costanti.TIPOLOGIA_CITTA));
        sistema.addAgenzia(agenzia1);

        Agenzia agenzia2 = new Agenzia("345", "Pluto", "Roma", Costanti.NO_ONLINE);
        agenzia2.addPacchetto(new Pacchetto("New York", 2500, LocalDate.of(2025, Month.AUGUST, 29), 10, Costanti.TIPOLOGIA_CROCIERA));
        sistema.addAgenzia(agenzia2);

        Agenzia agenzia3 = new Agenzia("1123", "Us", "Riccione", Costanti.NO_ONLINE);
        agenzia3.addPacchetto(new Pacchetto("Roma", 1500, LocalDate.of(2025, Month.MARCH, 28), 10, Costanti.TIPOLOGIA_CITTA));
        agenzia3.addPacchetto(new Pacchetto("Hong Kong", 300, LocalDate.of(2025, Month.MARCH, 8), 3, Costanti.TIPOLOGIA_CITTA));
        agenzia3.addPacchetto(new Pacchetto("Rimini", 800, LocalDate.of(2025, Month.JANUARY, 8), 5, Costanti.TIPOLOGIA_CITTA));
        sistema.addAgenzia(agenzia3);

        return sistema;
    }

}

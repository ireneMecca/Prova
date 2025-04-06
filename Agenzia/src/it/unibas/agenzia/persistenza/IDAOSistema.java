package it.unibas.agenzia.persistenza;

import it.unibas.agenzia.modello.SistemaInformatico;
import java.io.InputStream;

public interface IDAOSistema {

    SistemaInformatico carica(InputStream file) throws DAOException;

}

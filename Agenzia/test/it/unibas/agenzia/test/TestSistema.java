package it.unibas.agenzia.test;

import it.unibas.agenzia.modello.SistemaInformatico;
import it.unibas.agenzia.persistenza.DAOException;
import it.unibas.agenzia.persistenza.DAOSistemaMock;
import it.unibas.agenzia.persistenza.IDAOSistema;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class TestSistema {

    private SistemaInformatico sistema;

    @Before
    public void setUp() {
        IDAOSistema daoSistema = new DAOSistemaMock();
        try {
            sistema = daoSistema.carica(null);
        } catch (DAOException e) {

        }

    }
    
    @Test
    public void testCarica(){
        Assert.assertEquals(3, sistema.getListaAgenzie().size());
    }
}


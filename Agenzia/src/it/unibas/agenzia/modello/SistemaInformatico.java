package it.unibas.agenzia.modello;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class SistemaInformatico {
    
    private List<Agenzia> listaAgenzie = new ArrayList<>();
    
        public void addAgenzia (Agenzia agenzia) {
        this.listaAgenzie.add(agenzia);
    }

}

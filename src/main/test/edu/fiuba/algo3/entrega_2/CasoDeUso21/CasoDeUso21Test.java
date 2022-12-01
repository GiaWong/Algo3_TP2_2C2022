package edu.fiuba.algo3.entrega_2.CasoDeUso21;

import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso21Test {

    @Test
    public void UnMutaliscoNoPuedeEvolucionarAGuardianSinRecursosNecesrios() {
        Mutalisco mutalisco = new Mutalisco();
        BancoDeRecursos banco = new BancoDeRecursos();
        assertThrows(NoHayRecursosSuficientes.class,()->{mutalisco.evolucionarGuardian(banco);});
    }

}

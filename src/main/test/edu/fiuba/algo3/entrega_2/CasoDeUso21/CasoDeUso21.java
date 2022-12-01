package edu.fiuba.algo3.entrega_2.CasoDeUso21;

import edu.fiuba.algo3.modelo.Construccion.Extractor;
import edu.fiuba.algo3.modelo.Exception.NoTienesLosMaterialesNecesariosParaCrearEsaUnidad;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Guardian;
import edu.fiuba.algo3.modelo.Unidades.Mutalisco;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class CasoDeUso21 {

    @Test
    public void UnMutaliscoNoPuedeEvolucionarAGuardianSinRecursosNecesrios() {
        Mutalisco mutalisco = new Mutalisco();
        BancoDeRecursos banco = new BancoDeRecursos();
       assertThrows(NoTienesLosMaterialesNecesariosParaCrearEsaUnidad.class,()->{mutalisco.evolucionarGuardian(banco);});
    }

}

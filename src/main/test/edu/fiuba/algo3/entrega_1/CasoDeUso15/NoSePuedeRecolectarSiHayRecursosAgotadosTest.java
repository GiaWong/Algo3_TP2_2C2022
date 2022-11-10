package edu.fiuba.algo3.entrega_1.CasoDeUso15;

import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorRecursoAgotado;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Recursos.NodoMineral;
import edu.fiuba.algo3.modelo.Recursos.Volcan;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.RefineriaGas.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Zerg.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NoSePuedeRecolectarSiHayRecursosAgotadosTest {

    @Test
    public void ZanganoIntentaRecolectarMineralEnNodoDeMineralAgotadoYSeLanzaUnError() {

        NodoMineral nodo = new NodoMineral();
        Zangano zangano = new Zangano();
        nodo.agotarse();
        assertThrows(ErrorRecursoAgotado.class,()->zangano.recolectar(nodo));
    }

    @Test
    public void ExtractorRecolectaGasDeUnVolcanAgotadoYSeLanzaUnError() {

        Mapa mapa = new Mapa();
        Extractor extractor = new Extractor();
        mapa.agregar(extractor,0,1);
        Zangano zangano1 = new Zangano();
        Zangano zangano2 = new Zangano();
        Zangano zangano3 = new Zangano();
        extractor.cargarZerg(zangano1);
        extractor.cargarZerg(zangano2);
        extractor.cargarZerg(zangano3);
        extractor.avanzarTurno(166); //en extractor hay un msj privado que recolecte
        assertThrows(ErrorRecursoAgotado.class,()->extractor.recolectar());
    }
    @Test
    public void ElNexoMineralIntentaRecolectarMineralEnNodoDeMineralAgotadoYSeLanzaUnError() {

        NodoMineral nodo = new NodoMineral();
        NexoMineral nexo = new NexoMineral(nodo);
        nexo.avanzarTurno(100);
        assertThrows(ErrorRecursoAgotado.class,()->nexo.recolectar());
    }

    @Test
    public void AsimiladorRecolectaGasDeUnVolcanAgotadoYSeLanzaUnError() {

        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador(volcan);
        asimilador.avanzarTurno(250); //en extractor hay un msj privado que recolecte
        assertThrows(ErrorRecursoAgotado.class,()->asimilador.recolectar());
    }


}

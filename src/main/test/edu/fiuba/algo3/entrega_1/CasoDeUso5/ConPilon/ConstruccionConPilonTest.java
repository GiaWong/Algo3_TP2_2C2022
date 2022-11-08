package edu.fiuba.algo3.entrega_1.CasoDeUso5.ConPilon;

import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.Turno.Turno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstruccionConPilonTest {

    @Test
    public void SeConstruyeEdificioAccesoDentroDelRangoPilon() {

        boolean esperado = true;
        Pilon pilon = new Pilon(3);
        pilon.empezarAConstruirSegun(new Turno(5));


        Acceso acceso = new Acceso(1); /*cree el concepto de tamanio para relacionarlo con el radio*/
        acceso.empezarAConstruirSegun(pilon, new Turno(8));
        boolean resultado = pilon.estaEnRango();

        assertEquals(resultado, esperado);
    }
    @Test
    public void SeConstruyeEdificioNexoMineralDentroDelRangoPilon() {

        boolean esperado = true;
        Pilon pilon = new Pilon(3);
        pilon.empezarAConstruirSegun(new Turno(5));


        NexoMineral nexo = new NexoMineral(2);
        nexo.empezarAConstruirSegun(pilon, new Turno(8));
        boolean resultado = pilon.estaEnRango();

        assertEquals(resultado, esperado);
    }
    @Test
    public void SeConstruyeEdificioPuertoEstelarDentroDelRangoPilon() {

        boolean esperado = true;
        Pilon pilon = new Pilon(3);
        pilon.empezarAConstruirSegun(new Turno(5));


        PuertoEstelar puerto = new PuertoEstelar(3);
        puerto.empezarAConstruirSegun(pilon, new Turno(8));
        boolean resultado = pilon.estaEnRango();

        assertEquals(resultado, esperado);
    }
    @Test
    public void SeConstruyeEdificioAsimiladorDentroDelRangoPilon() {

        boolean esperado = true;
        Pilon pilon = new Pilon(3);
        pilon.empezarAConstruirSegun(new Turno(5));


        Asimilador asimilador = new Asimilador(1);
        asimilador.empezarAConstruirSegun(pilon, new Turno(8));
        boolean resultado = pilon.estaEnRango();

        assertEquals(resultado, esperado);
    }
}

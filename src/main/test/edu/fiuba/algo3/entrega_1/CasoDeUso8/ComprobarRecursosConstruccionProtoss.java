package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Pilon;
import edu.fiuba.algo3.modelo.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.RefineriaGas.Asimilador;
import edu.fiuba.algo3.modelo.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Zerg.ReservaProduccion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionProtoss {

    @Test
    public void SeConstruyeNexoMineralProtossSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        NexoMineral nexo = new NexoMineral();
        boolean  resultado = nexo.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeReservaPilonProtossSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Pilon pilon = new Pilon(5);
        boolean  resultado = pilon.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeAsimiladorProtossSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Asimilador asimilidador = new Asimilador();
        boolean  resultado = asimilidador.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyeAccesoProtossSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        Acceso acceso = new Acceso();
        boolean  resultado = acceso.costeDeMateriales(mineral,gasVespeno);
        assertEquals(resultado, esperado);
    }

    @Test
    public void SeConstruyePuertoEstelarProtossSinRecursosNecesarios(){
        int gasVespeno = 50;
        int mineral = 25;
        boolean esperado = false;
        PuertoEstelar puerto = new PuertoEstelar();
        boolean  resultado = puerto.costeDeMateriales(mineral,gasVespeno);

        assertEquals(resultado, esperado);

    }
}


package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.ConstruccionProtoss.*;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComprobarRecursosConstruccionProtoss {

    @Test
    public void SeIntentanAdquirir5NexoMineralYSeCompranSolo4PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 4;
        Raza protoss = new Protoss();
        for (int i = 0; i < 5; i++){
            protoss.comprar(new NexoMineral());
        }
        int resultado = protoss.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas); //Esto despues podemos hacer que si no se puede comprar, que lanze una exception
    }

    @Test
    public void SeIntentanAdquirir3PilonYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 2;
        Raza protoss = new Protoss();
        for (int i = 0; i < 3; i++){
            protoss.comprar(new Pilon());
        }
        int resultado = protoss.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirir3AsimiladorYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 2;
        Raza protoss = new Protoss();
        for (int i = 0; i < 3; i++){
            protoss.comprar(new Asimilador());
        }
        int resultado = protoss.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirir2AccesoYSeCompraSolo1PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 1;
        Raza protoss = new Protoss();
        for (int i = 0; i < 2; i++){
            protoss.comprar(new Acceso());
        }
        int resultado = protoss.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

    @Test
    public void SeIntentanAdquirir1PuertoEstelarYNoSePuedeComprarPorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        int construccionesEsperadas = 0;
        Raza protoss = new Protoss();
        protoss.comprar(new PuertoEstelar());
        int resultado = protoss.obtenerCantidadConstrucciones();
        assertEquals(resultado, construccionesEsperadas);
    }

}


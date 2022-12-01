package edu.fiuba.algo3.entrega_2.CasoDeUso25;

import edu.fiuba.algo3.modelo.Exception.JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno;
import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso25Test {

    @Test
    public void ChequearInicializacionDeUnJugador(){
        Partida partida = new Partida();
        String nombre = "Matias";
        String color = "Azul";
        Zerg raza = new Zerg();
        partida.agregarJugador(nombre,color,raza);


        assertTrue(partida.primerJugador().tieneMismoNombre("Matias"));
        assertTrue(partida.primerJugador().tieneMismoColor("Azul"));
        assertTrue(partida.primerJugador().tieneMismaRaza(raza));

    }

    @Test
    public void NoSePuedeCargarUnJugadorConUnNombreMenorA6Caracteres(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        assertThrows(NombreDeberiaTener6caracteresComoMinimo.class,()->partida.agregarJugador("Mat","Azul",raza));

    }

    @Test
    public void NoSePuedeCrearUnSegundoJugadorConElMismoNombre(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        partida.agregarJugador("Matias","Azul",raza);
        assertThrows(JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno.class,()->partida.agregarJugador("Matias","Rosa",raza));


    }

    @Test
    public void NoSePuedeCrearUnSegundoJugadorConElMismoColor(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        partida.agregarJugador("Matias","Azul",raza);
        Protoss raza1 = new Protoss();
        assertThrows(JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno.class,()->partida.agregarJugador("Eduardo","Azul",raza1));


    }

    @Test
    public void NoSePuedeCrearUnSegundoJugadorConLaMismaRaza(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        partida.agregarJugador("Matias","Azul",raza);
        assertThrows(JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno.class,()->partida.agregarJugador("Eduardo","Roza",raza));


    }
}

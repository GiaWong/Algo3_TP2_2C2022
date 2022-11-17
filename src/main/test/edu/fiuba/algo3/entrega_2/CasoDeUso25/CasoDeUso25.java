package edu.fiuba.algo3.entrega_2.CasoDeUso25;

import edu.fiuba.algo3.modelo.Exception.JugadorDosNoPuedeTenerLosMismosAtributosQueJugadorUno;
import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Partida.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso25 {

    @Test
    public void ChequearInicializacionDeUnJugador(){
        Partida partida = new Partida();
        Zerg raza = new Zerg();
        partida.agregarJugador("Matias","Azul",raza);



        assertEquals(partida.primerJugador().obtenernombre(),"Matias");
        assertEquals(partida.primerJugador().obtenercolor(),"Azul");
        assertEquals(partida.primerJugador().obtenerraza().getClass(),raza.getClass());

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

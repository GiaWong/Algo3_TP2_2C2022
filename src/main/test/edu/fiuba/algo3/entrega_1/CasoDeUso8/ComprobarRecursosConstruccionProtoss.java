package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComprobarRecursosConstruccionProtoss {


    /*@Test
    public void testRazaZergQuiereConstruirseUnCriaderoDeberiaPoderConstruirlo(){
        Zerg zerg = new Zerg();
        Criadero criadero = new Criadero();

        //Act y assert
        assertDoesNotThrow( ()-> {
            zerg.agregarEdificio(criadero);
        });
    }

    @Test
    public void testRazaZergQuiereConstruirseUnaReservaDeReproduccionDeberiaPoderConstruirlo(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();
        ReservaDeReproduccion reserva = new ReservaDeReproduccion();

        //Act y assert
        assertDoesNotThrow(  ()-> {
            razaZerg.agregarEdificio(reserva);
        });
    }

    @Test
    public void testRazaZergQuiereConstruirseUnExtractorDeberiaPoderConstruirlo(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();
        Extractor extractor = new Extractor();

        //Act y assert
        assertDoesNotThrow( ()-> {
            razaZerg.agregarEdificio(extractor);
        });
    }
    @Test
    public void testRazaZergQuiereConstruirseUnaGuaridaPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();
        Guarida guarida = new Guarida();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(guarida);
        });
    }
    @Test
    public void testRazaZergQuiereConstruirseUnEspiralPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();
        Espiral espiral = new Espiral();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(espiral);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnNexoMineralDeberiaPoderConstruirlo(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        NexoMineral nexoMineral = new NexoMineral( new NodoMineral() );

        //Act y assert
        assertDoesNotThrow(  ()-> {
            razaProtoss.agregarEdificio(nexoMineral);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnPilonDeberiaPoderConstruirlo(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        Pilon pilon = new Pilon();

        //Act y assert
        assertDoesNotThrow( ()-> {
            razaProtoss.agregarEdificio(pilon);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnAsimiladorDeberiaPoderConstruirlo(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        Asimilador asimilador = new Asimilador();

        //Act y assert
        assertDoesNotThrow(  ()-> {
            razaProtoss.agregarEdificio(asimilador);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnAccesoDeberiaPoderConstruirlo(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        Acceso acceso = new Acceso();

        //Act y assert
        assertDoesNotThrow(  ()-> {
            razaProtoss.agregarEdificio(acceso);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnPuertoEstelarPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        PuertoEstelar puertoEstelar = new PuertoEstelar();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(puertoEstelar);
        });
    }

    @Test
    public void testRazaZergSeCreaUnCriaderoDespuesNoSeDeberiaPoderCrearUnCriaderoMas(){
        //Arrange
        RazaZerg razaZerg = new RazaZerg();
        Criadero criadero = new Criadero();
        ReservaDeReproduccion reservaDeReproduccion = new ReservaDeReproduccion();
        Criadero criaderoExtra = new Criadero();

        //Act
        razaZerg.agregarEdificio(criadero); // gasto 200 de mineral

        //se quedo sin mineral lanza excepcion al intentar crear sin mineral un criadero.

        //assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(criaderoExtra);
        });

    }

    @Test
    public void testRazaProtosSeCreaUnPilonYUnAsimiladorDespuesNoSeDeberiaPoderCrearUnNexoMineral(){
        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();
        Pilon pilon = new Pilon();
        Asimilador asimilador = new Asimilador();
        NexoMineral nexoMineral = new NexoMineral( new NodoMineral() );

        //Act
        razaProtoss.agregarEdificio(pilon); // gasto 100 de mineral
        razaProtoss.agregarEdificio(asimilador); //gasta 100 de minerla

        //se quedo sin mineral lanza excepcion al intentar crear sin mineral un nexoMineral.

        //assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(nexoMineral);
        });

    }

    @Test
    public void SeIntentanAdquirir5NexoMineralYSeCompranSolo4PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new NexoMineral());
        banco.comprar(new NexoMineral());
        banco.comprar(new NexoMineral());
        banco.comprar(new NexoMineral());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new NexoMineral()));
    }

    @Test
    public void SeIntentanAdquirir3PilonYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new Pilon());
        banco.comprar(new Pilon());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Pilon()));
    }

    @Test
    public void SeIntentanAdquirir3AsimiladorYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new Asimilador());
        banco.comprar(new Asimilador());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Asimilador()));
    }

    @Test
    public void SeIntentanAdquirir2AccesoYSeCompraSolo1PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new Acceso());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Acceso()));
    }

    @Test
    public void SeIntentanAdquirir1PuertoEstelarYNoSePuedeComprarPorFaltaDeRecursos() {
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new PuertoEstelar()));
    }*/

}


package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComprobarRecursosConstruccionZerg {


    @Test
    public void SeIntentanAdquirir5CriaderosYSeCompranSolo4PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new Criadero());
        banco.comprar(new Criadero());
        banco.comprar(new Criadero());
        banco.comprar(new Criadero());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Criadero()));
    }

    @Test
    public void SeIntentanAdquirir2ReservaProduccionYSeCompranSolo1PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new ReservaProduccion());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new ReservaProduccion()));
    }

    @Test
    public void SeIntentanAdquirir3ExtractorYSeCompranSolo2PorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        banco.comprar(new Extractor());
        banco.comprar(new Extractor());
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Extractor()));
    }

    @Test
    public void SeIntentanAdquirirUnaGuaridaYNoSePuedeComprarPorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Guarida()));
    }

    @Test
    public void SeIntentanAdquirirUnEspiralYNoSePuedeComprarPorFaltaDeRecursos(){
        //Toda raza comienza con 200 Minerales y 0 GasVespeno.
        BancoDeRecursos banco = new BancoDeRecursos();
        assertThrows(NoHayRecursosSuficientes.class, ()-> banco.comprar(new Espiral()));
    }

}

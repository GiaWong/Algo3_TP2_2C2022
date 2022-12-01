package edu.fiuba.algo3.entrega_1.CasoDeUso8;

import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComprobarRecursosConstruccionProtoss {


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
    }

}


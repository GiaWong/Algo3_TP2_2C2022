package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Comandos.Ataque;
import edu.fiuba.algo3.modelo.Comandos.CreacionNexoMineral;
import edu.fiuba.algo3.modelo.Comandos.CreacionPilon;
import edu.fiuba.algo3.modelo.Comandos.CreacionPuertoEstelar;
import edu.fiuba.algo3.modelo.Construccion.Acceso;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.Dragon;
import edu.fiuba.algo3.modelo.Unidades.Scout;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import javafx.scene.layout.CornerRadii;

public class Protoss extends Raza {

    public Protoss(){

        acciones.put("CrearPilon",new CreacionPilon());
        acciones.put("CrearPuerto",new CreacionPuertoEstelar());
        acciones.put("CrearNexo",new CreacionNexoMineral());
        acciones.put("Ataque", new Ataque());

    }
    public Protoss(Suministro suministro){
        this.suministro = suministro;
    }
    public Protoss(BancoDeRecursos bancoDeRecursos){
        this.banco = bancoDeRecursos;
    }
    public void agregar(ConstruccionProtoss construccion, Coordenada coordenada, Mapa mapa) {
        this.comprar(construccion);
        mapa.agregar(construccion, coordenada);
    }


    public void agregar(UnidadProtoss unidad, Coordenada coordenada, Mapa mapa) {
        this.comprar(unidad);
        mapa.agregar(unidad, coordenada);
    }

    @Override
    public void elegirAccion(Turno turno, Mapa mapa) {
        //Pedirle al usuario que ingrese algo por consola
        String accion = System.in.toString();
        //Fijarnos si dicha Accion pertenece al rango de las Acciones disponibles en Protoss
        //Accion accion = listaComandos.getValue(accion);
        //this.asignarAccion(accion);
    }


}

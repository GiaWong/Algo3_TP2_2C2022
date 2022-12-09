package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Escudo;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEnEsteTerreno;
import edu.fiuba.algo3.modelo.Exception.NoSePuedeConstruirEsteEdificioSobreUnRecurso;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

public class Pilon extends ConstruccionProtoss implements ConstruccionConRadio{

    private final int radio;


    public Pilon(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(300);
        escudo = new Escudo(300);
        radio = 3;
        tiempoConstruccion = 5;
    }

    public Pilon(Vida vida1){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = vida1;
        escudo = new Escudo(300);
        radio = 3;
        tiempoConstruccion = 5;
    }

    public Pilon(int tiempoDeConstruccion){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(300);
        escudo = new Escudo(300);
        tiempoConstruccion = tiempoDeConstruccion;
        radio = 3;
    }

    public boolean esPrerequisito(Construccion construccion){
        return false;
    }

    public void verificarPrerequisito(Mapa mapa) {
    }

    public void regenerarEscudo(){
        escudo.regenerarEscudo(10);
    }

    public int obtenerEscudo() {return escudo.escudoActual(); }

    public int obtenerVida() {return vida.vidaActual(); }


    public void avanzarTurno() {
        this.regenerarEscudo();
        this.construir();
    }

    public void energizar(Mapa mapa) { //Cambiar los tests cuando decia que lanzaba un error! Ahora ya no lanza mas un error.
        if (estaDisponible()){
            mapa.setearRadio(coordenada, radio, new ConEnergia());
        }
    }

    public void destruir(Mapa mapa){
        mapa.setearRadio(coordenada, 3, new SinTerreno());
    }


    @Override
    public void avanzarTurno(Mapa mapa) {
        this.regenerarEscudo();
        this.construir();
        this.energizar(mapa);
    }

    @Override
    public boolean permiteConstruir(Construccion construccion){
        return false;
    }

    @Override
    public boolean permiteConstruir(ReservaProduccion reservaProduccion){
        return false;
    }

    @Override
    public boolean permiteConstruir(Guarida guarida){
        return false;
    }

    @Override
    public boolean permiteConstruir(Acceso acceso){
        return false;
    }

    public void permiteConstruirConUnidad(Unidad unidad){

    }

    public void permiteConstruirConUnidad(Zangano zangano){

    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {
        throw new NoSePuedeConstruirEsteEdificioSobreUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {}

    @Override
    public void esPosibleConstruirEn(ConEnergia energia) {}

    @Override
    public void esPosibleConstruirEn(ConMoho moho){
        throw new NoSePuedeConstruirEnEsteTerreno();
    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {}

    @Override
    public void aumentarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(5);
    }
}

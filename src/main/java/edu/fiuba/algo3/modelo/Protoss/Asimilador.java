package edu.fiuba.algo3.modelo.Protoss;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Imperio.Exceptions.ErrorRecursoAgotado;

public class Asimilador extends Construccion {

    private int escudo = 450;

    private  final int TIEMPO_CONSTRUCCION = 6;

    private final int GAS_POR_TURNO = 20;

    private int gasExtraido;

    private int turnos;

    private int gasRecolectado;

    @Override
    public void avanzarTurno(int i) {
        this.turnos += i;
        if(escudo<450){
            escudo=450;
        }

        for(int j = 0; j < i; j++){
            this.recolectar();
        }
    }

    public void recolectar(){
        if(gasExtraido>=5000){
            throw new ErrorRecursoAgotado();
        }
        this.gasRecolectado += GAS_POR_TURNO;
    }

    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }

    public int gasRecolectado() {
        return this.gasRecolectado;
    }

    public boolean estaOperativo() {
        return true;
    }

    public boolean sePuedeConstruir(boolean hayVolcan,boolean hayNodoMineral) {
        return (hayVolcan);
    }

    public boolean sePuedeConstruir(boolean hayMoho, int energia) {
        return true;
    }

    public Asimilador(){
        this.turnos = 0;
        this.gasRecolectado = 0;
    }

    public void recibeDanio(int danio) {
        escudo-=danio;
        if(escudo<0){
            vida +=escudo;
            escudo=0;
        }
    }

    public int obtenerEscudo() {
        return escudo;
    }

    public int obtenerVida() {
        return vida;
    }
}

package edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;

import javax.security.auth.login.CredentialException;

public class NodoMineral implements Recurso{

    private int cantidad = 2000;

    public int recolectar(int cant) {
        if (cantidad > 0){
            cantidad -= cant;
            return cant;
        }
        return 0;
    }

    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        //Devuelve True si la construccion es una RefineriaMineral.
        NexoMineral nexo = new NexoMineral();
        return (unaConstruccion.getClass().equals(nexo.getClass()));
    }
}

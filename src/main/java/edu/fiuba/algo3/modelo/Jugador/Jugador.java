package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;
import edu.fiuba.algo3.modelo.Mapa.Mapa;

public class Jugador {

    private String nombre;
    private String color;
    private Raza raza;
    private  Accion accion;

    public Jugador(String unNombre, String unColor, Raza unaRaza){
        this.setNombre(unNombre);
        this.setColor(unColor);
        this.setRaza(unaRaza);
    }

    public void setNombre(String unNombre) throws NombreDeberiaTener6caracteresComoMinimo {

        if (unNombre.length() < 6) {
            throw new NombreDeberiaTener6caracteresComoMinimo();
        }
        nombre = unNombre;
    }

    public void setColor(String unColor){
        color = unColor;
    }

    public void setRaza(Raza unaRaza){
        raza = unaRaza;
    }

    /*
    public void elegirAccion(Mapa mapa) {
        estaJugando = true;
        accion = raza.elegirAccion(this, mapa);
    }

     */

    public void asignarAccion(Accion unaAccion){
        accion = unaAccion;
    }

    public void ejecutarAccion() {
        accion.ejecutar();
    }

    public boolean esIgualA(Jugador otroJugador) {
        return (otroJugador.tieneMismoNombre(nombre) && otroJugador.tieneMismoColor(color) && otroJugador.tieneMismaRaza(raza));
    }

    public boolean tieneMismoNombre(String otroNombre){
        return nombre.equals(otroNombre);
    }

    public boolean tieneMismoColor(String otroColor){
        return color.equals(otroColor);
    }

    public boolean tieneMismaRaza(Raza otraRaza) {
        return raza.getClass().equals(otraRaza.getClass());
        //return raza.equals(otraRaza); //No se si esto lo toma
    }

    public boolean tieneConstrucciones(Mapa mapa){
        return raza.tieneConstrucciones(mapa);
    }

}

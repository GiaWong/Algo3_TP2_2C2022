package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Jugador {

    private String nombre;
    private String color;
    private Raza raza;

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

    public void jugar(Turno turno, Mapa mapa) {

        // while raza.noTengaMasRecursos(){
        //      Construccion const = pedirUnaConstruccionAlUsuario();
        //      Coordenada coord = pedirUnaCoordenadaAlUsuario();
        //      raza.agregar(const, coord, mapa);

        //      Coordenada otraCoord = pedirUnaCoordenadaAlUsuario();
        //      raza.crearUnidad(otraCoord, mapa);

        //      raza.atacar()
        raza.avanzar(turno, mapa);
    }

    public boolean comparar(Jugador otroJugador) {
        return (otroJugador.tieneMismoNombre(nombre) && otroJugador.tieneMismoColor(color) && otroJugador.tieneMismaRaza(raza));
    }

    public boolean tieneMismoNombre(String otroNombre){
        return nombre.equals(otroNombre);
    }

    public boolean tieneMismoColor(String otroColor){
        return color.equals(otroColor);
    }

    public boolean tieneMismaRaza(Raza otraRaza) {
        return raza.equals(otraRaza); //No se si esto lo toma
    }

}

package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Exception.NombreDeberiaTener6caracteresComoMinimo;

public class Jugador {

    private String nombre;
    private String color;
    private Raza raza;

    public void setNombre(String unNombre) throws NombreDeberiaTener6caracteresComoMinimo {
        if(unNombre.length()<6){
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

    public void avanzarturno() {
    }

    public void jugar() {
    }

    public boolean comparar(Jugador jugador) {
        String nombreJ =jugador.obtenernombre();
        String colorJ =jugador.obtenercolor();
        Raza razaJ =jugador.obtenerraza();
        return (nombre!=nombreJ&&colorJ!=color&&(razaJ.getClass().equals(raza.getClass())));

    }

    public Raza obtenerraza() {return raza;
    }

    public String obtenercolor() {return color;
    }

    public String obtenernombre() {return nombre;
    }
}

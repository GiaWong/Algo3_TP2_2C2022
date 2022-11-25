package edu.fiuba.algo3.modelo.Unidades;

public interface Defendible { //Capaz deberia estar en otra carpeta, porque Construccion deberia tener lo mismo

     void recibirDanio(Danio danio); //Por esto tenia pensado crear un objeto Danio
                                   // Para que despues Danio se encargue de bajar la vida/escudo a lo que sea

}

package animalEcosistema;

import java.util.ArrayList;
import java.util.List;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion2;

public class Halcon extends Ave implements IAccion2{

    public List<Pato> amigosPatos;

    public Halcon(String nombre){
        setNombre(nombre);
        amigosPatos = new ArrayList<Pato>();
    }

    @Override
    public void volar(){
        System.out.println("El halcon esta volando...");
    }

    @Override
    public String toString(){
        return    "\n Clase : " + getClass().getName()
                + "\n nombre: " + getNombre()
                + "\n nroAlas: " + getNroALas();    
    }

}

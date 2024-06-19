package animalEcosistema;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;

public class Correcamino extends Ave implements IAccion1{
    
    public Correcamino(String nombre){
        setNombre(nombre);
    }

    @Override
    public void correr() {
        System.out.println("Correcaminos corriendo...");
    }

    @Override
    public String toString(){
        return    "\n Clase : " + getClass().getName()
                + "\n nombre: " + getNombre()
                + "\n nroAlas: " + getNroALas();    
    }

}

package animalEcosistema;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccion2;
import animalEcosistema.comportamiento.IAccion3;

public class Pato extends Ave implements IAccion1, IAccion2, IAccion3{

    public Halcon amigHalcon;
    public Pato(String nombre){
        setNombre(nombre);
        amigHalcon = new Halcon("Halconsito");
    }

    @Override
    public String toString(){
        return    "\n Clase : " + getClass().getName()
                + "\n nombre: " + getNombre()
                + "\n nroAlas: " + getNroALas();    
    }

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando...");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando...");
    }

    @Override
    public void correr() {
        System.out.println("El pato esta corriendo...");
    }

}

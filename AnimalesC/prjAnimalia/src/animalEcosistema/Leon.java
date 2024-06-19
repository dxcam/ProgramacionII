package animalEcosistema;

import animalClasificacion.Mamimefero;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccionCarnivora;

public class Leon extends Mamimefero implements IAccion1, IAccionCarnivora{

    public Pato alimentoPatuno;

    public Leon(String nombre){
        setNombre(nombre);
        alimentoPatuno = new Pato("Lucas");
    }


    @Override
    public String toString(){
        return    "\n Clase : " + getClass().getName()
                + "\n nombre: " + getNombre();
    }


    @Override
    public void comer() {
        System.out.println("Leon no come...");
     
    }


    @Override
    public void comer(Pato alimentoPatuno) {
        System.out.println("Leon come: " + alimentoPatuno.toString());
    }


    @Override
    public void correr() {
        System.out.println("Leon corre...");
    }

}

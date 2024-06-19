package animal;

import clasificacionAnimal.Insecto;

public class Arana extends Insecto implements IComportamientoAnimal, IComportamientoInsecto{

    public Arana(String nombre){
        setNombre(nombre);
        nacer();
    }

    @Override
public void nacer() {
    System.out.println("Araña naciendo..."+getNombre());
}

@Override
public String comer(String comida){
    return "Este araña ha comido " + comida;
}

Override
public String comer(){
    return "Este araña ha comido hambre" ;
}

@Override
public String comer(Mosca mosca); 
    return "Esta araña ha comido una mosca muerta" +mosca;
    

}

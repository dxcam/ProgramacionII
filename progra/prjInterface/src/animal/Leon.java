package animal;

import clasificacionAnimal.Vertebrado;

public class Leon extends Vertebrado implements IComportamientoAnimal {

    public Leon[String nombre]{
        setNombre(nombre);
        nacer();
    }


@Override
public void nacer() {
    System.out.println("Leon naciendo..."+getNombre());
}

@Override
public String comer(String comida){
    return "Este leon ha comido " + comida;
}

Override
public String comer(){
    return "Este leon ha comido hambre" ;
}

}

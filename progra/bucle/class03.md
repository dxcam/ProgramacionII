Fecha: 07/05/2024
___

## BUCLES

Para crear un archivo de Java dirigirse en la pestaña de JAVA PROJECTS en la carpeta de "src" y en la paleta de comandos colocar el nombre del archivo.
___
EJEMPLO
___
- Codigo para generar signos alternos utilizando "for":
  
``` JAVA
public class BucleFor {
public void SignosAlternos(){
        for(int i=1;i<15;i++)
            if(i%2==0)
                System.out.print("- ");
            else
                System.out.print("+ ");
        System.out.println(" ");        
    }
}
```
___
METODO

``` java
public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de la variable bucleFor de tipo BucleFor
        int a;
        BucleFor bucleFor;

        //instanciar new
        bucleFor = new BucleFor();
        
        //Llamar a un metodo
        bucleFor.SignosAlternos();
    }
}
```

___
Fecha: 08/05/2024
___

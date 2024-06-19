public class Usuario {
    private String nombre;
    private Integer edad;

    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer edad){
        if (edad > 0)
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre(){
        return this.nombre;
    }

    public Boolean ingresar(){
        String nombreString;
        System.out.println("Dime tu nombre: ");
        nombreString = App.sc.nextLine();
        setNombre(nombreString);
        return true;
    } 

    public void crearDino(){
        if (ingresar())
            System.out.println("Crear Dino");
        else
            System.out.println("Primero debes logearte el sistema");
    }
}

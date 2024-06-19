public class Juego {
    public Jugador usuario;
    private String barca;
    private String rio;
    private String[] ladoIzq;
    private String[] ladoDer;
    private Boolean vikingoEstaIzq;

    public Juego(){
        this.usuario = new Jugador();
        this.rio = "-".repeat(20);
        this.barca = "\\_V_;_?_/";
        this.vikingoEstaIzq = true;
        this.ladoIzq = new String[] {"V","L","C","U"};
        this.ladoDer = new String[] {"","","",""};
    }

    public short mostrarMenu(){
        int opc = -1;
        System.out.println("\n                    "+ barca + rio);
        System.out.println("\n 0 Vikingo va solo "
                          +"\n 1 Lobo             "
                          +"\n 2 Caperucita       "
                          +"\n 3 Uvas             "
                          +"\n 4 Salir            ");
    do{
        try{
            opc = -1;
            System.out.println("\n[+] Ingrese una opción: ");
            opc = App.sc.nextInt();
            //if(opc<4)
            //return(short) opc;
            if(opc==4){
                System.out.println("¡Te vere pronto...cobarde...!");
                System.exit(0);
            }
        }catch(Exception e){App.sc.next();}
    }
    while(opc >=4 && opc<0);
    return (short) opc;
    }
}

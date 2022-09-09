package interfacesFuncionales;

public interface MetodosProDefault {

    void metodo1(String arg);
    void metodo2(String arg);
    void metodo3(String arg);

    default void metodo4(String arg){
        System.out.println("metodo 4");
        metodo6("");
    }

    default void metodo6(String arg){
        System.out.println("metodo 4");
    }

    static void metodo5(String arg){ // no se va a poder sobrescribir
        System.out.println("metodo 5");
    }

    static void metodo7(String arg){ // no se va a poder sobrescribir
        //metodo6("");
        System.out.println("metodo 5");
    }


    //java 8 : metodos por default
/*
    default void metodoImplementado(String arg){
        //logica
        System.out.printf("hola");
    }
 */
}

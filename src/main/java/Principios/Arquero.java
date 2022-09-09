package Principios;

public class Arquero extends Seleccion {


    private String estatura;

    private Arquero(String nombre, String apellido, String fechaNac, String estatura) {
        super();
        //super(nombre, apellido, fechaNac);
        this.estatura = estatura;
    }

    public Arquero getIntancia(String nombre, String apellido, String fechaNac, String estatura) {
        return new Arquero(nombre, apellido, fechaNac, estatura);
    }

    public boolean taparPenal() {
        //implementar logica compleja

        //
        System.out.println("penal tapado");
        return true;
    }

    public static void main(String[] args) {

        //wrapper -> primitivo
        Integer objetoNumero  = 10; // jdk 1.4 error en compilacion
        Integer objeto1Numero = new Integer(10);

        //wrapper -> primitivo : autounboxing
        Integer suma = (objetoNumero + objeto1Numero);//autoboxing

        int suma1 = objetoNumero.intValue() + objeto1Numero.intValue();
        // Objeto = primitivo



        int numero = 2147483647;
        numero = numero + 2;
        System.out.println(numero);

        byte numer1 = (byte) numero; // 8 <- 32

        System.out.println(numer1);
    }

    //-2147483648 +1
    //-2147483647 +2


}

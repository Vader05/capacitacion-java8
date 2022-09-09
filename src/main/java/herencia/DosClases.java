package herencia;

class Principal {

    public static void main( String args[] ) {
        Secundaria s = new Secundaria();

        s.saluda(); // Saludo de "Secundaria"
        saluda(); // Saludo de "Principal"
    }

    public static void saluda() {
        System.out.println( "Saludando desde <Principal>" );
    }

}


// ----------------------------------------------------

class Secundaria {

    public void saluda() {
        System.out.println( "Saludando desde <Secundaria>" );
    }

}

public class DosClases {
    public static void mensaje() {
        System.out.println("hola");
    }
}

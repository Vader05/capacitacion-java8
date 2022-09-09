package clasesAnidadas;

public class ClaseInternaTest {
    public static void main(String[] args) {
        Externa externa=new Externa();
        Externa.Interna interna= new Externa.Interna();
        interna.imprimir();
        externa.imprimir();

        Externa.imprimir2();


    }
}

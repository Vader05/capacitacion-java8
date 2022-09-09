package clasesAnidadas;

public class Externa { // default -> visible en el mismo paquete

    public static String CONSTANTE = "CONST";
    public static class Interna {
        public void imprimir() {
            System.out.println("Clase interna");
        }
    }

    public void imprimir() {
        System.out.println("Clase externa");
    }

    public static void imprimir2() {
        System.out.println("Clase externa");
    }
}

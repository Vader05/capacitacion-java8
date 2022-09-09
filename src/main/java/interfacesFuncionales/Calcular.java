package interfacesFuncionales;

import java.util.Comparator;

public class Calcular {
    public static void main(String[] args) {
        InterfaceSuma cal = new InterfaceSuma() {
            @Override
            public double sumar(double a, double b) {
                System.out.println("sumando...");
                return a+b;
            }
        };

        InterfaceSuma cal1 = (n1 , n2) -> {
            double resultado= n1+n2;
            System.out.println("La suma es:" +resultado);
            return  resultado;
        };

        InterfaceSuma cal2 = (n1 , n2) -> n1+n2;


        cal.sumar(8,5);
        operacion(cal);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

    }
    static void operacion(InterfaceSuma cal) {
        System.out.println("operacion");
        InterfaceSuma.printResult(cal.sumar(10.0, 20.0));
    }
}

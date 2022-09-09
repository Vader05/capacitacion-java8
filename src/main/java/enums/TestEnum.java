package enums;


//import static java.lang.Integer.MIN_VALUE;
//import static java.lang.Integer.parseInt;

import static java.lang.Integer.*;

public class TestEnum{
    public static void main(String[] args) {
        Colores rojo = Colores.ROJO;
        String valorRojo = rojo.getValor();

        System.out.println(rojo.getAcronimo());
        System.out.println(rojo.name());

        System.out.println(valorRojo);

        System.out.println(Colores.values());

        Integer.parseInt("10");


        System.out.println(Integer.MIN_VALUE);


    }
}

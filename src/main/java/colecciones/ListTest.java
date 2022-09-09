package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();

        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");

        for (String s: colores) {
           // System.out.println(s);
        }

        Iterator<String> it = colores.iterator();

        /*
        while (it.hasNext()){
           // System.out.println(it.next());
        }

         */

        colores.forEach(c -> System.out.println(c));

    }

}

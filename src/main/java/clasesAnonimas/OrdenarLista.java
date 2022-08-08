package clasesAnonimas;

import java.util.*;

public class OrdenarLista {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("azul");
        miLista.add("negro");
        miLista.add("verde");
        miLista.add("negro");
        miLista.add("blanco");

        /*
        Comparator comparador = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(miLista, comparador);

         */

        /*
        // java < 8
        Collections.sort(miLista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

         */


        miLista.sort((obj1, obj2)-> obj2.compareTo(obj1));


        /*
        miLista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


         */

        for (String item : miLista) {
            System.out.println("item -> " + item);
        }
    }

}

package colecciones;

import Ejercicios.Empleado;
import expresionesLambda.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {

        final Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "hola");
        hashMap.put(3, "aaaaaa");
        hashMap.put(4, "bbbbbb");
        hashMap.put(2, "mundo");
/*

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        for (Integer key : hashMap.keySet()) {
            System.out.println(key);
        }



        final Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(4, "bbbbbb");
        treeMap.put(2, "mundo");
        treeMap.put(3, "aaaaaa");
        treeMap.put(1, "hola");


        for(Map.Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        final Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(4, "bbbbbb");
        linkedHashMap.put(2, "mundo");
        linkedHashMap.put(3, "aaaaaa");
        linkedHashMap.put(1, "hola");


        for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

 */

        final Map<String, Empleado> empleado = new HashMap<>();

        empleado.put("1", new Empleado("kevin", 1025, "sistemas"));
        empleado.put("2", new Empleado("Luis", 1025, "rrhh"));
        empleado.put("3", new Empleado("Pedro", 1025, "conta"));
        empleado.put("4", new Empleado("kevin", 1025, "sistemas"));
        empleado.put("5", new Empleado("kevin", 1025, "sistemas"));
        empleado.put("6", new Empleado("kevin", 1025, "sistemas"));


        for(Map.Entry<String, Empleado> entry : empleado.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}

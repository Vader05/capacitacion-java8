package Streams;

import Predicates.Alumno;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 15));
        alumnos.add(new Alumno("kevin", "cueva", 21, "M", 20));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 14));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 19));

        Function<Alumno, String> obtenerNombre = (alumno)->{
            System.out.println("dentro de la expresion lambda de function");
            return alumno.getNombre();
        };

        alumnos.stream().map(obtenerNombre).forEach(i-> System.out.println(i));








        /*
        double promedio = alumnos.stream().collect(Collectors.averagingInt(alu-> alu.getNota()));
        Optional<Alumno> alumno = alumnos.stream().min(Comparator.comparing(a -> a.getEdad()));
        System.out.println(alumno.get());
        System.out.println(promedio);
         */
    }
}

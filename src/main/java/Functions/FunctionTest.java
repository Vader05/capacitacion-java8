package Functions;

import Predicates.Alumno;
import expresionesLambda.Person;

import java.util.function.*;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplicaPor10 = s -> s * 10;

        Function<Integer, Integer> alCuadrado = (Integer s) -> {
            return s * s;
        };

        Function<Integer, Integer> alCubo = s -> s * s * s;
        UnaryOperator<Integer> alCubo2 = i -> i*i*i;

        IntUnaryOperator alcuboPrimitivo = p -> p*p*p;

        alcuboPrimitivo.applyAsInt(10);

        alCubo2.andThen(alCubo2).apply(2);

        Function<Alumno, Person> mapeo =  (Alumno alumno) -> {
            Person person = new Person(
                    alumno.getNombre(),
                    "",
                    Person.Sex.MALE,
                    "");
            return person;
        };
        Function<Integer, Integer> mapeo2 = s -> s * s * s;

        //System.out.println(multiplicaPor10.apply(30));

        Alumno alumnoTarget = new Alumno(
                "maria",
                "perez",
                29,
                "F",
                19);

        Person personMapeada = mapeo.apply(alumnoTarget);
        //System.out.println(personMapeada);

        //ejecuta la logica de las funciones en orden de derecha a izquierda
        //el resultado de la primera es la entrada de la segunda funcion
        Integer resultado = multiplicaPor10.compose(alCuadrado).apply(25);

        //ejecuta la logica de las funciones en orden de izquierda a derecha
        Integer resultado2 = multiplicaPor10.andThen(alCuadrado).apply(2);

        //System.out.println("resultado con compose -> "+ resultado);//6250
        System.out.println("resultado con andThen -> "+ resultado2);//6250

        System.out.println(Function.identity().apply("hola mundo"));

    }

    static Person convertirAlumnoApersona(Alumno alumno) {
        return  new Person(alumno.getNombre(), "", Person.Sex.MALE, "kevin@gmail.com");
    }


}

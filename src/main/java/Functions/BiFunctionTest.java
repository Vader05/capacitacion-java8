package Functions;

import java.util.Comparator;
import java.util.function.*;

public class BiFunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplicaPor10 = s -> new Integer(s.intValue() * 10); // int

        Function<Integer, Integer> alCuadrado = s -> s * s;

        //Function<Integer, Integer> alCubo = s -> s * s * s;

        Function<Double, Double> alCubo = s -> s * s * s;
        UnaryOperator<Double> alCubounary = s -> s * s * s;

        BiFunction<Double, Double, Double> elevaAl = (numero, expo)-> Math.pow(numero, expo);

        BinaryOperator<Double> elevaAl2 = (numero, expo)-> Math.pow(numero, expo);



        ToDoubleFunction<Double> test = (d)-> d*d;
        IntToDoubleFunction test2 = i-> i*i;

        Double resultado = elevaAl.apply(15.0, 3.0);

        //System.out.println(resultado);

        int numero = multiplicaPor10.apply(new Integer(10)).intValue();


        int num2 = multiplicaPor10.apply(10); //10 -> new Integer(10);

        Double potencia = elevaAl.andThen(alCubo).apply(10.0, 2.0);
        //System.out.println(potencia);


        Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);
        BinaryOperator<String> comparatorBi = BinaryOperator.minBy(comparator);
        System.out.println(comparatorBi.apply("hola", "mundo"));




    }
}

package clasesAbstractas;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static java.util.Arrays.*;

public class TestClaseAbstracta extends ClaseAbstracta {


    public TestClaseAbstracta(int numero) {
        super();
    }




    public static void main(String args[]) throws FileNotFoundException {
        TestClaseAbstracta test = new TestClaseAbstracta(10);

        test.mensaje();
        test.metodo2();
        //test.getColor();
        //exec();

        //size(10);

        String[][] strs = new String[5][];

        strs[1] = new String[2];

        //System.out.print(strs.length+strs[1].length);

        int m = 9, n = 1, x = 0;

        while (m > n) {

            m--;

            n += 2;

            x += m + n;

        }

        System.out.println(x);
    }



        public static void exec () throws FileNotFoundException {
            //throw new RuntimeException();
        }

        static public int size (Object obj){

            return ((int[]) obj).length;

        }

    @Override
    void metodo() {

    }

    @Override
    void mensaje() {

    }
}

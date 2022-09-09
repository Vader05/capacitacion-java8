package clasesAbstractas;
import static java.util.Arrays.*;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;

public class Whiz{ //Whiz.class

    static int x=2;

    public final float FEE= 0.012f;
    public final Float FEE1= (Float) 0.012f;

    static int z;

    public static void main(String args[]){

        //System.out.println(x+z);


        StringBuilder sb = new StringBuilder();

        sb.append("11").insert(1,"22").insert(4,"33");

        System.out.print(sb);

        int value = 9;
        System.out.println(square(value));
        System.out.println(MIN_VALUE);
        System.out.println(MAX_VALUE);


    }

    static{

        int x=3;

        z=x;

    }

    public static long square(int x) {
        long y = x * (long) x;

        x=-1;

        return y;

    }

}

class Clase2 { //clase2.class

}



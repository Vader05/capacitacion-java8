package herencia;

import java.io.FileNotFoundException;

public class TestDosClases {
    public final float FEE= 2.0f;
    public static void main(String[] args) {

        Integer.toUnsignedString(1);
        /*
        char[] chars = new char[4];
        chars[0] = 0;
        chars[1] = 2;
        String out = "123456789";
        out.getChars(0,3,chars,0);
        for (char c: chars)
            System.out.print(c);
         */

        int y = 0;

        while(y--<10) {
            continue;
        };

        String message = y>10? "Greater than" : "Less than";

        System.out.println(message+ "10");





        /*
        try {
            exec();
        } catch (FileNotFoundException e) {
            System.out.println("error" +e);
        }

         */
    }

    public static void exec() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}

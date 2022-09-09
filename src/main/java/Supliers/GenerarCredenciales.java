package Supliers;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenerarCredenciales {
    public static void main(String[] args) {

        String nombre = "kevin";
        String apellidos ="cueva";
        Integer telefono = 21312313;

        Supplier<String> getPassword = () -> {
            String pwd="";
            String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String symbols = "#$@.%/()?¡";

            Supplier<Integer> d=()->(int)(Math.random()*10);
            Supplier<Character> c=()->characters.charAt((int)(Math.random()*26));
            for (int i = 0; i < 6; i++) {
                pwd += c.get();
            }
            pwd += d.get();
            pwd += symbols.charAt(d.get());
            return pwd;
        };

        Supplier<String> genUsuario = () -> {

            String cuenta = nombre+"."+apellidos+"@aws.com";
            return cuenta;
        };

        Consumer<String> mostrarUsuario= correo -> System.out.println("correo generado: "+ correo);
        Consumer<String> mostrarContrasenia= pass -> System.out.println("Contraseña generada: "+ pass);

        mostrarUsuario.accept(genUsuario.get());
        mostrarContrasenia.accept(getPassword.get());

    }
}

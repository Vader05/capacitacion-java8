package clasesAnonimas;

public class CalcularImpl implements Calcular{
    @Override
    public double sumar(Calculadora numeros) {
        return numeros.getNumero1() + numeros.getNumero2();
    }

    void metodo() {
        System.out.println("");
    }
}

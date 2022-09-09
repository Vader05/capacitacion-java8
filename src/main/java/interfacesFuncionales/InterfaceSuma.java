package interfacesFuncionales;

@FunctionalInterface
public interface InterfaceSuma {

    double sumar(double a, double b);

    default double resta(double a, double b){
        return a - b;
    }

    static void printResult(double val){
        System.out.println("resultado: " + val);
    }

}

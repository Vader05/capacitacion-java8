package interfacesFuncionales;

public class OtraClaseImpl implements MetodosProDefault{
    @Override
    public void metodo1(String arg) {
        System.out.println("desde OtraClaseImpl");
    }

    @Override
    public void metodo2(String arg) {
        System.out.println("desde OtraClaseImpl");
    }

    @Override
    public void metodo3(String arg) {
        System.out.println("desde OtraClaseImpl");
    }

    public static void main(String[] args) {
        OtraClaseImpl inst = new OtraClaseImpl();
    }
}

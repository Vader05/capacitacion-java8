package herencia;

class Person{
    //se carga una unica vez
    //inicializan las variables estaticas
    //1ro null
    //asignan sus valores

    Person(){

        System.out.print("CP");

    }


    static{ System.out.print("SP "); } // static: se ejecutan cuando se carga la clase en memoria
    //{ System.out.println("no estatico"); } //se ejecuta cuando se crea una instancia del objeto persona
    /*
    laksdlkas
    kajsdlaks
    laksjdlas
     */

    /**
    asjdalksd
     lajdlaks
     lkasjdlask
     alskjdlas
     */

}

class Student extends Person{

    Student(){

        System.out.print("CS ");

    }

}

class Teacher extends Person{

    Teacher(){

        System.out.print("CT ");

    }

    public Teacher(String s){

        System.out.print("OCT ");

    }

}

class Whiz{

    public static void main(String[] args){

        Person p1=new Teacher("name"); //referencia a la clase

        Student s1=new Student();

    }

}

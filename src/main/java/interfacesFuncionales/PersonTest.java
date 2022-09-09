package interfacesFuncionales;

import expresionesLambda.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jose", "05/04/90", Person.Sex.MALE, "jose.matos@gmail.com"));
        people.add(new Person("Juan", "05/04/91", Person.Sex.MALE, "juan.perez@gmail.com"));
        people.add(new Person("Bruno", "05/04/92", Person.Sex.MALE, "bruno.pinasco@gmail.com"));
        people.add(new Person("Carlos", "05/04/93", Person.Sex.MALE, "calos.huaman@gmail.com"));
        people.add(new Person("Daniel", "05/04/94", Person.Sex.MALE, "daniel.cardenas@gmail.com"));
        people.add(new Person("Maria", "05/04/94", Person.Sex.FEMALE, "maria.duran@gmail.com"));
        people.add(new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com"));


        Verificar verificarGenero = new Verificar() {
            @Override
            public boolean test(Person persona) {
                return persona.getGender().equals(Person.Sex.FEMALE);
            }
        };

        //boolean test(Person person1);
        /*
        Verificar verificarGeneroL = (Person person1) -> { //completa
            return person1.getGender().equals(Person.Sex.FEMALE);
        };
         */

        Verificar verificarGeneroL = person1 -> person1.getGender().equals(Person.Sex.FEMALE); // compacta
        Verificar verificarNombreL = person1 -> person1.getName().contains("a"); // compacta

        //imprimirPersonas(verificarGeneroL, people);

        //int compare(T o1, T o2);
        Comparator<Person> comparator = (Person o1, Person o2) -> o1.getName().compareTo(o2.getName());

        //< 1.8
        //Collections.sort(people, (Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
        /*
        for (Person p : people) {
                System.out.println(p);
        }

         */

        //1.8

        people.sort(comparator);
        for (Person p : people) {
            System.out.println(p);
        }

    }

    static void imprimirPersonas(Verificar verificar, List<Person> personList){
        for (Person p : personList) {
            if(verificar.test(p)){
                System.out.println(p);
            }
        }
    }
}

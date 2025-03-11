import java.util.Set;

import entities.set.People;

public class AppPeopleHashSet {

  public static void main(String[] args) {

    PeopleHashSet peopleHashSet = new PeopleHashSet();

    People p1 = new People("Emerson", 42, "DEV", 1.72f, "1");

    People p2 = new People("Marta", 47, "DEVA", 1.67f,"2");

    People p3 = new People("Mariana", 20, "Est", 1.77f, "3");

    People p4 = new People("Stella", 14, "Est", 1.62f, "4");

    People p5 = new People("Stella", 15, "Est1", 1.62f, "3");

    People p6 = new People("Mariana", 20, "Est", 1.77f, "3");

    People p7 = new People("Mariana", 20, "Est", 1.77f, "3");

    People p8 = new People("Mariana", 20, "Estudent", 1.77f,"3");

    peopleHashSet.addPerson(p1);

    peopleHashSet.addPerson(p2);

    peopleHashSet.addPerson(p3);

    peopleHashSet.addPerson(p4);

    peopleHashSet.addPerson(p5);

    peopleHashSet.addPerson(p6);

    peopleHashSet.addPerson(p7);

    peopleHashSet.addPerson(p8);

    System.out.println(
        "------------------ Ordenar por idade ------------------------------------------");

    peopleHashSet.viewList();

    System.out.println(
        "------------------------------------------------------------");

    Set<People> ordenateByAge = peopleHashSet.ordenateByAge();

    System.out.println(ordenateByAge);

    Set<People> ordenateByHeight = peopleHashSet.ordenateByHeight();

    System.out.println(
            "-------------------- Ordenar por altura ----------------------------------------");

    System.out.println(ordenateByHeight);
  }

}

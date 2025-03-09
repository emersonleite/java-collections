import entities.People;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        PeopleArrayList peopleArrayList = new PeopleArrayList();

        People p1 = new People("Emerson", 50, "Dev", 1.72f);
        People p2 = new People("Marta", 50, "Divaneide", 1.65f);
        People p3 = new People("Mariana", 20, "DEVA", 1.65f);
        People p4 = new People("Stella", 15, "DEVA", 1.62f);
        People p5 = new People("Neuza", 62, "Mãe", 1.57f);

        peopleArrayList.addPerson(p1);
        peopleArrayList.addPerson(p2);
        peopleArrayList.addPerson(p3);
        peopleArrayList.addPerson(p4);
        peopleArrayList.addPerson(p5);

        System.out.println("Ordenando por idade:");
        List<People> reordenateByAge = peopleArrayList.ordenateByAge();
        System.out.println(reordenateByAge);

        System.out.println();

        System.out.println("Ordenando por altura:");
        List<People> reordenateByHeight = peopleArrayList.ordenateByHeight();
        System.out.println(reordenateByHeight);

        System.out.println();

        System.out.println("Procurando por nome - Emerson");
        List<People> listFindByName = peopleArrayList.findByName("Emerson");
        System.out.println(listFindByName);

        System.out.println();

        System.out.println("Removendo duas pessoas - utilizando uma lista - Emerson e Marta");
        List<People> listToExclude = new ArrayList<>();
        listToExclude.add(p1);
        listToExclude.add(p2);
        peopleArrayList.removeMany(listToExclude);
        peopleArrayList.viewList();
        System.out.println();

        System.out.println("Removendo uma pessoa -  Mariana");
        peopleArrayList.removeOne(p3);
        peopleArrayList.viewList();
        System.out.println();

        System.out.println("Removendo Neuza");
        peopleArrayList.removeByName("Neuza");
        peopleArrayList.viewList();
        System.out.println();

        System.out.println("Removendo Stella (lista fica vazia)");
        peopleArrayList.removeByName("Stella");
        peopleArrayList.viewList();
        System.out.println();

        System.out.println("Tentando remover pessoa que não existe");
        peopleArrayList.removeByName("Ola mundo");

    }
}

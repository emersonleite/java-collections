import entities.People;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        PeopleList peopleList = new PeopleList();

        People p1 = new People("Emerson", 50, "Dev", 1.72f);
        People p2 = new People("Marta", 50, "Divaneide", 1.65f);
        People p3 = new People("Mariana", 20, "DEVA", 1.65f);
        People p4 = new People("Stella", 15, "DEVA", 1.62f);
        People p5 = new People("Neuza", 62, "Mãe", 1.57f);

        peopleList.addPerson(p1);
        peopleList.addPerson(p2);
        peopleList.addPerson(p3);
        peopleList.addPerson(p4);
        peopleList.addPerson(p5);

        System.out.println("Ordenando por idade:");
        List<People> reordenateByAge = peopleList.ordenateByAge();
        System.out.println(reordenateByAge);

        System.out.println();

        System.out.println("Ordenando por altura:");
        List<People> reordenateByHeight = peopleList.ordenateByHeight();
        System.out.println(reordenateByHeight);

        System.out.println();

        System.out.println("Procurando por nome - Emerson");
        List<People> listFindByName = peopleList.findByName("Emerson");
        System.out.println(listFindByName);

        System.out.println();

        System.out.println("Removendo duas pessoas - utilizando uma lista - Emerson e Marta");
        List<People> listToExclude = new ArrayList<>();
        listToExclude.add(p1);
        listToExclude.add(p2);
        peopleList.removeMany(listToExclude);
        peopleList.viewList();
        System.out.println();

        System.out.println("Removendo uma pessoa -  Mariana");
        peopleList.removeOne(p3);
        peopleList.viewList();
        System.out.println();

        System.out.println("Removendo Neuza");
        peopleList.removeByName("Neuza");
        peopleList.viewList();
        System.out.println();

        System.out.println("Removendo Stella (lista fica vazia)");
        peopleList.removeByName("Stella");
        peopleList.viewList();
        System.out.println();

        System.out.println("Tentando remover pessoa que não existe");
        peopleList.removeByName("Ola mundo");

    }
}

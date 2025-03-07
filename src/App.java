import entities.People;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        PeopleList peopleList = new PeopleList();

        People p1 = new People("Emerson", 50, "Dev");
        People p2 = new People("Marta", 50, "Divaneide");
        People p3 = new People("Mariana", 20, "DEVA");
        People p4 = new People("Stella", 15, "DEVA");
        People p5 = new People("Neuza", 62, "Mãe");

        peopleList.addPerson(p1);
        peopleList.addPerson(p2);
        peopleList.addPerson(p3);
        peopleList.addPerson(p4);
        peopleList.addPerson(p5);

        List<People> l1 = peopleList.findByName("Emerson");

        System.out.println("Mostrando l1");
        System.out.println(l1);

        peopleList.viewList();

        List<People> listToExclude = new ArrayList<>();
        listToExclude.add(p1);
        listToExclude.add(p2);

        peopleList.removeMany(listToExclude);



        peopleList.viewList();

        peopleList.removeOne(p3);

        peopleList.viewList();

        // Removendo Neuza

        peopleList.removeByName("Neuza");

        peopleList.viewList();

        peopleList.removeByName("stella");

        peopleList.viewList();

        peopleList.removeByName("Ola mundo");

    }
}

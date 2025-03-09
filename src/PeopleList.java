import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparators.HeightComparator;
import entities.People;

@SuppressWarnings("SpellCheckingInspection")
public class PeopleList {

    List<People> peopleList;

    public PeopleList() {
        this.peopleList = new ArrayList<People>();
    }

    public void addPerson(People person) {
        this.peopleList.add(person);
    }

    public void viewList() {
        System.out.println(this.peopleList);
    }

    private boolean isListEmpty() {
        if (this.peopleList.isEmpty()) {
            System.out.println("a lista está vazia");
        }
        return this.peopleList.isEmpty();
    }

    public void removeOne(People p1) {
        if (isListEmpty()) {
            return;
        }
        this.peopleList.remove(p1);
    }

    public void removeByName(String name) {
        if (isListEmpty()) {
            return;
        }

        List<People> listToExclude = new ArrayList<>();

        for (People p : this.peopleList) {
            if (p.getName().equalsIgnoreCase(name)) {
                listToExclude.add(p);
            }
        }
        this.peopleList.removeAll(listToExclude);
    }

    public void removeMany(List<People> peopleList) {
        if (isListEmpty()) {
            return;
        }
        this.peopleList.removeAll(peopleList);
    }

    public List<People> findByName(String name) {
        List<People> list = new ArrayList<>();

        for (People p : this.peopleList) {
            if (p.getName().equalsIgnoreCase(name)) {
                list.add(p);
            }
        }
        return list;
    }

    public List<People> ordenateByAge() {
        List<People> list = new ArrayList<>(peopleList);
        Collections.sort(list);
        return list;
    }

    /* Utilizando uma Classe que extende Comparator */
    public List<People> ordenateByHeight() {
        List<People> list = new ArrayList<>(peopleList);
        Collections.sort(list, new HeightComparator());
        return list;

    }
}

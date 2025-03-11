import comparators.HeightComparator;
import entities.set.People;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("SpellCheckingInspection")
public class PeopleHashSet {

    private Set<People> peopleList;

    public PeopleHashSet() {
        this.peopleList = new HashSet<>();
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

        Set<People> listToExclude = new HashSet<>();

        for (People p : this.peopleList) {
            if (p.getName().equalsIgnoreCase(name)) {
                listToExclude.add(p);
            }
        }
        this.peopleList.removeAll(listToExclude);
    }

    public void removeMany(Set<People> peopleList) {
        if (isListEmpty()) {
            return;
        }
        this.peopleList.removeAll(peopleList);
    }

    public Set<People> findByName(String name) {
        Set<People> list = new HashSet<>();

        for (People p : this.peopleList) {
            if (p.getName().equalsIgnoreCase(name)) {
                list.add(p);
            }
        }
        return list;
    }

    public Set<People> ordenateByAge() {
        Set<People> listByAge = new TreeSet<>(peopleList);
        return listByAge;
    }

    /* Utilizando uma Classe que extende Comparator - HeightComparator */
    public Set<People> ordenateByHeight() {
        Set<People> listByHeight = new TreeSet<>(new HeightComparator());
        listByHeight.addAll(peopleList);
        return listByHeight;
    }
}

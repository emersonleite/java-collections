import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import entities.People;

public class PeopleList {

  List<People> peopleList = null;

  public PeopleList() {
    this.peopleList = new ArrayList<>();
  }

  public void addPerson(People person) {
    this.peopleList.add(person);
  }

  public void viewList() {
    System.out.println(this.peopleList);
  }


  private boolean isListEmpty(){
    if(this.peopleList.isEmpty()) {
      System.out.println("a lista está vazia");
    }
    return this.peopleList.isEmpty();
  }

  public void removeOne(People p1) {
    if(isListEmpty()){
      return;
    }
    this.peopleList.remove(p1);
  }

  public void removeByName(String name){
    if(isListEmpty()){
      return;
    }

    List<People> listToExclude = new ArrayList<>();

      for(People p: this.peopleList){
        if(p.getName().equalsIgnoreCase(name)){
          listToExclude.add(p);
        }
      }
      this.peopleList.removeAll(listToExclude);
  }

  public List<People> findByName(String name){
    List<People> list = new ArrayList<>();

    for(People p: this.peopleList){
      if(p.getName().equalsIgnoreCase(name)){
        list.add(p);
      }
    }
    return list;
  }

  public void removeMany(List<People> peopleList){
    if(isListEmpty()){
      return;
    }
    this.peopleList.removeAll(peopleList);
  }
}

package comparators;

import java.util.Comparator;
import entities.list.People;

public class HeightComparator implements Comparator<People> {

  @Override
  public int compare(People p1, People p2) {
    return Float.compare(p1.getHeight(), p2.getHeight());
  }

}

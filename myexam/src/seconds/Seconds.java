package seconds;

import java.util.ArrayList;
import java.util.List;

public class Seconds {

  public static void main(String[] args) {
    List<Integer> newList = new ArrayList();
    for (int i=0; i < 10; i++) {
      newList.add(i+1);
    }
    System.out.println("Original list: " + newList);
    System.out.println("Every second member of original list: " + getEverySecond(newList));
  }

  public static List<Integer> getEverySecond(List<Integer> inputList) {
    List<Integer> secondsList = new ArrayList<>();

    for (int i=0; i < inputList.size(); i += 2) {
      secondsList.add(inputList.get(i));
    }

    return secondsList;
  }
}

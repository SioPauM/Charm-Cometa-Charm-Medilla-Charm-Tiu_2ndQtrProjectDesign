import java.util.*;

public class Person {
  private String name;
  private int risk, mood;

  public Person(String a, int c) {
    name = a;
    risk = 15;
    mood = c; 
  }

  public int getRisk() {
    return risk;
  }

  public void increaseMood(int x) { //subject to change
    mood += x;
  }

  public void decreaseMood(int x) { //subject to change
    mood -= x;
  }

  public void checkRisk() {
    if (mood <= 30) {
      risk = 20;
    } else if (mood >= 71) {
      risk = 10;
    }
  }

  
  
}
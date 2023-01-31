import java.util.*;

public class Agent extends Cat {
  private String codeName;
  private int food, affectionPoints;

  public Agent(String a, String b, String c) {
    super(a, b);
    codeName = c;
    food = 0;
  }

  public String getCodeName() {
        return codeName;
  }

  public int getAffectionPoints() {
        return affectionPoints;
  }

  public int getFood() {
        return food;
  }

  // public String getMission() { 
  //       return mission;
  // }

  public void purrsuade(Person e, int f) {
    e.increaseMood(f);
  }

  public void actCute() {
    System.out.print(codeName + " acted cute and caught the attention of the people, increasing fame and affection points!");
    affectionPoints += 5;
  }

  public void stealFood(Person a, int b, int c) {
    int randomNum = (int)(Math.random() * 101);
    if (randomNum <= b) {
      System.out.print("Attempt Failed.");
    } else if (randomNum < b) {
      System.out.print("Attempt Successful.");
      food += 5;
    }
    a.decreaseMood(c);
  }

  
  
}
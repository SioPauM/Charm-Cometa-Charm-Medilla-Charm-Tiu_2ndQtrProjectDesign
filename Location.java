import java.util.*;

public class Location {
  private String locName, difficulty;
  private int risk;

  public Location (String a, int b, String c) {
    locName = a;
    risk = b;
    difficulty = c;
  }

  public int getRisk() {
    return risk;
  }

  public String getDifficulty() {
    return difficulty;
  }
  
}
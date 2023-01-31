import java.util.*;

public class Mission {
  private String operationName;
  private int requiredFood, currentFood;
  private boolean accomplished;

  public Mission(String a, int b, int c) {
    operationName = a;
    requiredFood = b;
    currentFood = c;
    accomplished = false;
  }

  public void checkStatus() {
    if (requiredFood <= currentFood) {
      accomplished = true;
    } else if (currentFood < requiredFood) {
      accomplished = false;
    }
  }

  public String getOpName() {
    return operationName;
  }

  public int getReqFood() {
    return requiredFood;
  }

  public int getCurrentFood() {
    return currentFood;
  }

  public void setCurrentFood(int x) {
    currentFood += x;
  }
  
  
}
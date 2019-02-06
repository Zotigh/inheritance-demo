package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  public CanisLupus() {
    System.out.println("CanisLupis::new");
  }
  
  @Override
  public void vocalize() {
    System.out.println("Howl!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt prey in packs");

  }
  
  public static void about() {
    System.out.println("Canis lupus is a species of canis, and has the features of that group.");
    }

}

package edu.cnm.deepdive;

public abstract class Canis {

 public static final int NUMBER_OF_LEGS = 4;
 
 
 public Canis() {
   System.out.println("CanisLupis::new");
 }
 
 public abstract void vocalize();
 
 public abstract void hunt();

@Override
public String toString() {
  return "I am a " + this.getClass().getSimpleName();
 }

public static void about() {
  System.out.println("Canis is a genus of Candae, and has the features of that group.");
  }
 
}

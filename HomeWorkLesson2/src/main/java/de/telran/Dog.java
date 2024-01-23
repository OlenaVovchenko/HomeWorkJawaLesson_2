package de.telran;

public class Dog extends Pet{
private String say = "ГАВ!";
private boolean isGurdsHous = true;


public Dog(int weight, String color, String name, String say, boolean isClimbTrees) {
        super(weight, color, name);
        this.say = say;
        this.isGurdsHous = isClimbTrees;
        }

public String getSay() {
        return say;
        }

public void setSay(String say) {
        this.say = say;
        }

public boolean isClimbTrees() {
        return isGurdsHous;
        }

public void setClimbTrees(boolean climbTrees) {
    isGurdsHous = climbTrees;
        }

public  void guardingDog () {
        if (isGurdsHous) {
        System.out.println(name +" "+ weight + " kg " + color + " color " + " guards the house and speaks to strangers " + say);
        }
        }
}

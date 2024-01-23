package de.telran;

public class Cat extends Pet{
    private String say = "МЯУ!";
    private boolean isClimbTrees = true;


    public Cat(int weight, String color, String name, String say, boolean isClimbTrees) {
        super(weight, color, name);
        this.say = say;
        this.isClimbTrees = isClimbTrees;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public boolean isClimbTrees() {
        return isClimbTrees;
    }

    public void setClimbTrees(boolean climbTrees) {
        isClimbTrees = climbTrees;
    }

    public  void climbingCat () {
        if (isClimbTrees) {
            System.out.println(name +" "+ weight + " kg " + color + " color " + " can climb trees and speak " + say);
        }
    }
    }


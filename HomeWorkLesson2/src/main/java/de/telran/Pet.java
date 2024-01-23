package de.telran;

public class Pet {
    int weight;
    String color;
    String name;

    public Pet(int weight, String color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;
    }
    public void demoPet() {
        System.out.println("Pet Name: " + name +  " , color: " + color +
                ", weight: " + weight);
    }
}

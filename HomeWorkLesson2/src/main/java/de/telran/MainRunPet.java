package de.telran;

public class MainRunPet {
      public static void main(String[] args) {
        Pet pet = new Pet(45, "black", "Brus");
        pet.demoPet();

        Cat cat = new Cat(5, "black", "Vasya", "Mjauuu!", true);
        cat.climbingCat();

        Dog dog = new Dog(50,"gray", "Rex", "GAV!", true);
        dog.guardingDog();
    }
}
// 1 уровень сложности: 1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
//         и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
//         общие, а какие проявляются только у конкретного типа.

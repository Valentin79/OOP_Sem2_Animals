import Animals.*;
import Human.Human;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Вася");
        Human human2 = new Human("Петя");
        Animal animalCat = new Cat("Муся");
        Animal animalDog = new Dog("Жучка");
        Animal animalHorse = new Horse("София");
        Animal animalCat2 = new Cat("Барсик");
        Animal animalHamster = new Hamster("Бу");

        RelationInterface relations = new RelationHumanAnimal();
        relations.addAnimalToHuman(human1, animalCat);
        relations.addAnimalToHuman(human1, animalDog);
        relations.addAnimalToHuman(human1, animalHorse);
        relations.addAnimalToHuman(human2, animalCat2);
        relations.addAnimalToHuman(human2, animalHamster);

        System.out.println(relations.returnAnimalsByHuman(human2));


        for (Animal a : relations.returnAnimalsByHuman(human1)) {
            Actions.callAnimal(human1, a);
        }
        for (Animal a : relations.returnAnimalsByHuman(human2)) {
            Actions.strokeAnimal(human2, a);
        }
    }

}

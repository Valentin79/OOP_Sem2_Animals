import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Horse;
import Human.Human;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationHumanAnimal implements RelationInterface{
    public Map<Human, List<Animal>> humanToAnimals;

    public RelationHumanAnimal(){
        humanToAnimals = new HashMap<>();

    }
    @Override
    public void addAnimalToHuman(Human human, Animal animal){
        if(humanToAnimals.containsKey(human)){
            humanToAnimals.get(human).add(animal);
        }
        else{
            List<Animal> forAdding = new ArrayList<>();
            forAdding.add(animal);
            humanToAnimals.put(human, forAdding);
        }
    }

    @Override
    public List<Animal> returnAnimalsByHuman(Human human) {
        return humanToAnimals.get(human);
    }

//    @Override
//    public void callAnimal(Animal animal) {
//        System.out.println("Вы зовете " + animal);
//
//        if(animal.getClass() == Horse.class){
//            System.out.println(animal + " Недоверчиво подходит");
//        }
//        else if(animal.getClass() == Dog.class){
//            System.out.println(animal + " Подбегает, счастливо махая хвостом");
//        }
//        else if(animal.getClass() == Cat.class) {
//            System.out.println(animal + " Неторопливо идет к вам");
//        }
//
//    }


}

import Animals.Animal;
import Human.Human;

import java.util.List;

public interface RelationInterface {
    void addAnimalToHuman(Human human, Animal animal);
    List<Animal> returnAnimalsByHuman(Human human);


}


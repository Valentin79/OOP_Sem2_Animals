import Animals.*;
import Human.Human;

public class Actions implements ActionInterface {

    public static void callAnimal(Human human, Animal animal) {
        System.out.println(human + " зовет " + animal);

        if(animal.getClass() == Horse.class){
            System.out.println(animal + " Недоверчиво подходит k " + human);
        }
        else if(animal.getClass() == Dog.class){
            System.out.println(animal + " Подбегает к " + human +" приветливо виляя хвостом");
        }
        else if(animal.getClass() == Cat.class) {
            System.out.println(animal + " Неторопливо идет к " + human);
        }
        else if(animal.getClass() == Hamster.class) {
            System.out.println(animal + " Тупо таращится на " + human);
        }

    }

    public static void strokeAnimal(Human human, Animal animal){
        System.out.println(human +" гладит " + animal);

        if(animal.getClass() == Horse.class){
            System.out.println(animal + " Позволяет себя погладить");
        }
        else if(animal.getClass() == Dog.class){
            System.out.println(animal + " Жмурится и активно вертит хвостом");
        }
        else if(animal.getClass() == Cat.class) {
            System.out.println(animal + " Трется о "+ human +" и мурлычит");
        }
        else if(animal.getClass() == Hamster.class) {
            System.out.println(animal + " Опасливо водит носиком");
        }
    }
}

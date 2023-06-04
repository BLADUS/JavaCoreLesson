/**
 * @author Vladislav Osada
 * @date 28.05.2023 14:23
 */
public class TestAnimal {

    public static void main(String[] args) {
        Animal animal1;
        animal1 = new Animal();
        Animal animal2 = animal1;

        animal1.setAge(12);
        System.out.println(animal1.getAge());
    }

}

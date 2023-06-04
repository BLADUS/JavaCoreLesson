/**
 * @author Vladislav Osada
 * @date 04.06.2023 13:39
 */
public class Cat {
    private String name;
    private int age;
    private double strength;
    private double weight;

    public Cat(String name, int age, double strength, double weight) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getStrength() {
        return strength;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                ", weight=" + weight +
                '}';
    }

   static public String fightCat(Cat cat1, Cat cat2){
        double powerCat1 = calculatePowerCat(cat1);
        double powerCat2 = calculatePowerCat(cat2);

        System.out.println("Информация о первом коте: ");
       System.out.println(cat1.toString());
        System.out.println("Информация о втором коте: ");
       System.out.println(cat2.toString());
        if (powerCat1>powerCat2){
          return ("Кот " + cat1.getName() + " победил кота " + cat2.getName());
        }else {
            return ("Кот " + cat2.getName() + " победил кота " + cat1.getName());
        }
    }

    //Возращаем мощь кота
    static public double calculatePowerCat(Cat cat){
        return (cat.getStrength()*cat.getWeight()/cat.getAge());
    }
}

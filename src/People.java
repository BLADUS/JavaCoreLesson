/**
 * @author Vladislav Osada
 * @date 04.06.2023 13:04
 */
public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Конструктор по умолчани.
    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

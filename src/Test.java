import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vladislav Osada
 * @date 04.06.2023 13:10
 */
public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
/*      Cat cat1 = new Cat("Барсик", 2, 13.5,10);
        Cat cat2 = new Cat("Васелек", 1, 10,14);

        System.out.println( Cat.fightCat(cat1, cat2));*/

        /*int[] arrayInt = new int[3];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Введите значение массива для индекса: " + i);
           arrayInt[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arrayInt));

        System.out.println("Измените второй элемента наша массива");
        arrayInt[1]  = 13;

        System.out.println(Arrays.toString(arrayInt));*/

        List<Integer> listInteger = new ArrayList<>();

        System.out.println("Введите размер вашего списка:");
        int count = scanner.nextInt();
        for (int i = 0; i < count ; i++) {
            System.out.println("Введите " + (i + 1) + "элемент списка" );
            listInteger.add(scanner.nextInt());
        }

        System.out.println(listInteger);

        System.out.println("Удалим второй элемент из нашего списка:");
        listInteger.remove(1);

        System.out.println(listInteger);
    }
}

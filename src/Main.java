import java.util.Scanner;

/**
 * @author Vladislav Osada
 * @date ${DATE} ${TIME}
 */
public class Main {
    static Scanner scannerDouble = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    public static void main(String[] args) {
/*//Целочисленные типы дланных
        byte bytE;
        short shoRt;
        int inT;
        long lonG;
        *//*Типы данных с плавающей точкой*//*
        float floaT;
        double doublE;

        boolean booleaN;

        //Символ
        char chaR;

        //Тип данных хранящий в себе набор символов
        String string = "Hello";

        System.out.println(string + " world");
        System.out.println("Second message");

        //Операторы условия
        int a = 1;
        int b = 4;
        if (b > a) {
            System.out.println("Б больше чем А");
        } else if (a == b) {
            System.out.println("А равняется Б");
        } else {
            System.out.println("А больше чем Б");
        }
        //Циклы
        while (b > a) {
            System.out.println("Б больше чем А");
            a++;
            *//*a++ <=> a+=1 <=> a=a+1*//*
        }

        *//*1.Инициализация чего либо;Блок условия;Итерация*//*
        for (int i = 0; i < b; i++) {
            System.out.println("Значение i:" + i);
           *//* if(i==2){
                break;
            }*//*
            System.out.println("i меньше чем b");
        }*/

        System.out.println("Введите первое число:");
        double a = scannerDouble.nextDouble();
        System.out.println("Введите второе число:");
        double b = scannerDouble.nextDouble();
        while (true) {
            System.out.println("Введите операцию:");
            String operation = scannerString.next();

            switch (operation) {
                case "+": {
                    double result = a + b;
                    System.out.println("Результат сложения:" + result );
                    break;
                }
                case "-": {
                    double result = a - b;
                    System.out.println("Результат вычитания:" + result);
                    break;
                }
                case "*": {
                    double result = a * b;
                    System.out.println("Результат умножения:" + result);
                    break;
                }
                case "/": {
                    double result = a / b;
                    System.out.println("Результат деления:" + result);
                    break;
                }
                default: {
                    System.out.println("Вы ввели неизв. операцию");
                }
            }
        }
    }

}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("    Билет №1");
//        Билет №1.
//       1. Дайте определение переменной. Перечислите типы переменных и хранимые в них данные.//
//       2.Методы каких типов бывают? Приведите примеры использования каждого типа.//
//       3.Какие методы называются геттерами? Что они делают?

//        - Задача
//    Напишите программу, которая переворачивает массив.

        int[] myArray = {0, 2, 4, 6, 8};
        System.out.print(Arrays.toString(myArray) + " == > ");
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }
}





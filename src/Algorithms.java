import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {
        sayHello();
        sayHelloVyacheslav();
        numericArray();
    }

    static void sayHello() {
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int number = input.nextInt();
        if (number > 7) System.out.println("Привет");
    }

    static void sayHelloVyacheslav() {
        Scanner input = new Scanner(System.in);
        String saveName = "Вячеслав";
        System.out.print("Пожалуйста, введите имя: ");
        String name = input.nextLine();
        if (name.equals(saveName)) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени!");
        }
    }

    static void numericArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество цифр: ");
        int size = input.nextInt();
        System.out.print("Введите целые числа через пробел: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        input.close();
    }
}

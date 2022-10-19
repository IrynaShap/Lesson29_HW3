import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        divide(scan.nextInt());
    }

    private static void divide(double number) {
        int iterations = 0;

        while (number >= 50) {
            number = number / 2;
            iterations++;
        }

        if (iterations == 0) {
            System.out.println("Вы ввели слишком маленькое число");
        } else {
            System.out.println("Итераций: " + iterations);
            System.out.println("Результат: " + number);
        }
    }

}
package homework_6_animal;

import java.util.Scanner;
/**
 * 6.4 и 6.5 реализация
 */
public class Animal {
    int numberOfPaws;
    int age;

    public Animal() {
    }

    public void setParameters() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество лап:");
        numberOfPaws = in.nextInt();
        System.out.println("Введите возраст:");
        age = in.nextInt();
    }
}

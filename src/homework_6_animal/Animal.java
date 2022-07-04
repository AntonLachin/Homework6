package homework_6_animal;

import java.util.Scanner;
/**
 * 6.4 и 6.5 реализация
 */
public abstract class Animal {
    int numberOfPaws;
    int age;

    public Animal() {
    }

    public void setParameters(int numberOfPaws, int age) {
        this.age = age;
        this.numberOfPaws = numberOfPaws;
    }

    public abstract void setParameters();
}

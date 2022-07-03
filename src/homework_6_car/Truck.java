package homework_6_car;

import java.util.Scanner;
/**
 * 6.3 реализация
 */
public class Truck extends Car {
    int numberOfWheels;
    float maxWeight;

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колёс - " + numberOfWheels + ", максимальный вес - " + maxWeight);
    }

    public Truck(int w, String m, char c, float s, int n, float mw) {
        super(w, m, c, s);
        this.numberOfWheels = n;
        this.maxWeight = mw;
    }

    public void newWheels() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите новое количество колёс: ");
        numberOfWheels = in.nextInt();
        System.out.println("Новое количество колёс - " + numberOfWheels);
    }
}

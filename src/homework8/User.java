package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class User {
    private String name;

    public void user(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Map<String, Integer> gamers = new HashMap<>();

    /**
     * Метод, заполняющий Map - реализация
     */
    public void fillMap() {
        System.out.println("Пожалуйста введите количество игроков:");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int i = 1;
        Random rd = new Random();
        while (i < j + 1) {
            System.out.println("Пожалуйста введите имя игрока: ");
            String s = scanner.next();
            gamers.put(s, rd.nextInt(50));
            i++;
        }
    }
    /**
     * Метод, показывающий очки игрока - реализация
     */
    public void showPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите ник игрока чтобы узнать количество его очков: ");
        String s = scanner.next();
        if (gamers.containsKey(s)) {
            System.out.println("Количество очков "+s+" = "+ gamers.get(s));
        } else {
            System.out.println("Игрок с именем "+ s +" не зарегистрирован!");
        }
    }
}

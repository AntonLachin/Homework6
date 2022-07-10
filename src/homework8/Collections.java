package homework8;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /**
         * Метод, удаляющий дубликаты - проверка
         */
        List<String> list = new ArrayList<>();
        list.add("Somebody");
        list.add("told");
        list.add("me");
        list.add("told");
        list.add("that");
        list.add("told");
        list.add("you");
        list.add("had");
        list.add("told");
        list.add("a boyfriend");
        list.add("a boyfriend");
        list.add("a boyfriend");
        list.add("a boyfriend");
        list.add("told");
        list.add("told");
        list.add("who looks");
        list.add("a boyfriend");
        list.add("a boyfriend");
        list.add("like a");
        list.add("a girlfriend...");

        NoDoubles.removeDoubles(list);
        /**
         * Метод, добавляющий 1000000 в ArrayList и LinkedList,
         * метод рандомно выбирающий элемент 10000000 раз с замером времени - проверка
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(32);
        arrayList.add(145);
        arrayList.add(111);
        arrayList.add(1234);
        arrayList.add(12123);
        arrayList.add(14322);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(153);
        linkedList.add(1183);
        linkedList.add(1721);
        linkedList.add(15343);
        linkedList.add(112353);
        linkedList.add(143553);
        linkedList.add(112353);

        MillionElements.fillArray(10000000);

        MillionElements.fillLinked(10000000);

        MillionElements.randomArray(arrayList, 10000000);

        MillionElements.randomLinked(linkedList, 10000000);

        User gamer = new User();
        /**
         * Метод, заполняющий Map данными - проверка
         */
        gamer.fillMap();
        System.out.println(gamer.gamers);
        /**
         * Метод, показывающий очки игрока - проверка
         */
        gamer.showPoints();
    }
}

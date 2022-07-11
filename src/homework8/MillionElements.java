package homework8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MillionElements {
    public static void fillArray(Integer j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        Random rd = new Random();
        long time = System.currentTimeMillis();
        while (i < j) {
            i++;
            arrayList.add(rd.nextInt(1000));
        }
        //       System.out.println(arrayList);
        System.out.println(System.currentTimeMillis() - time + " ms");
    }

    public static void fillLinked(Integer j) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int i = 0;
        Random rd = new Random();
        long time = System.currentTimeMillis();
        while (i < j) {
            i++;
            linkedList.add(rd.nextInt(1000));
        }
//              System.out.println(linkedList);
        System.out.println(System.currentTimeMillis() - time + " ms");
    }

    public static void randomArray(ArrayList arrayList, Integer j) {
        int i = 0;
        Random rd = new Random();
        long time = System.currentTimeMillis();
        while (i < j) {
            i++;
            arrayList.get(rd.nextInt(arrayList.size()));
        }
        System.out.println(System.currentTimeMillis() - time + " ms");
    }

    public static void randomLinked(LinkedList linkedList, Integer j) {
        int i = 0;
        Random rd = new Random();
        long time = System.currentTimeMillis();
        while (i < j) {
            i++;
            linkedList.get(rd.nextInt(linkedList.size()));
        }
        System.out.println(System.currentTimeMillis() - time + " ms");
    }
}

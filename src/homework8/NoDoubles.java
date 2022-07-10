package homework8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * ћетод, удал€ющий дубликаты - реализаци€
 */
public class NoDoubles {
    public static void removeDoubles(List<String> list) {
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}

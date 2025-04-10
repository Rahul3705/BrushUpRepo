package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("List: " + list);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num: list){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num: list){
            if (frequencyMap.get(num) == 1){
                System.out.println("Non-Repeating Element: " + num);
                break;
            }
        }
    }
}

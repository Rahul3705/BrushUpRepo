package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("List: " + list);

        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: list){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Map: " + map);

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("Sorted List: " + sortedList);

        System.out.println("Top" + k + " Frequent Elements: ");
        for (int i = 0; i < k && i< sortedList.size(); i++) {
            System.out.println(sortedList.get(i).getKey() + " -> " + sortedList.get(i).getValue() + " times");
        }
    }
}

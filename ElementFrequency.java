package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item: list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(frequencyMap);
        for (Map.Entry<String, Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

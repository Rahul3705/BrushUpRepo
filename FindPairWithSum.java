package Assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairWithSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println("List: " + list);

        int sum = 7;

        Set<Integer> number = new HashSet<>();
        System.out.println("Pair with sum " + sum + ":");
        for (int num: list){
            int complement = sum - num;
            if (number.contains(complement)){
                System.out.println("(" + complement + ", " + num + ")");
            }
            number.add(num);
        }
    }
}

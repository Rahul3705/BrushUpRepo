package Assignment1;

import java.util.ArrayList;

public class MergeSortedLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        System.out.println("Array List 1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        System.out.println("Array List 2: " + list2);

        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()){
            if (list1.get(i) < list2.get(j)){
                mergedList.add(list1.get(i++));
            }else {
                mergedList.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i++));
        }
        while (j < list2.size()) {
            mergedList.add(list2.get(j++));
        }
        System.out.println(mergedList);
    }
}

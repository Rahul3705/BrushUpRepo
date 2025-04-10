package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.printf("Enter a size: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.printf("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        System.out.println(arrayList);

        ArrayList<Integer> newArray = new ArrayList<>();

        for (Integer a: arrayList){
            if (!newArray.contains(a)){
                newArray.add(a);
            }
        }
        System.out.println(newArray);
        sc.close();
    }
}

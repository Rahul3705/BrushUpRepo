package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArrayList {
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

        System.out.printf("\nEnter Rotation: ");
        int k = sc.nextInt();
        sc.close();

        ArrayList<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(arrayList.subList(n - k, n));
        rotatedList.addAll(arrayList.subList(0, n - k));

        System.out.println("Rotated List: " + rotatedList);
    }
}

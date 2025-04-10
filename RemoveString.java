package Assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("java");
        list.add("is");
        list.add("fun");
        list.add("ok");
        list.add("yes");

        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length()<3){
                iterator.remove();
            }
        }
        System.out.println("Filter List: " + list);

    }
}

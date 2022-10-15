import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
//        System.out.println(l1);

        l1.addFirst(567);
        l1.addLast(345);
        l1.add(4,678);

        System.out.println(l1);
        System.out.println(l1.isEmpty());

        for (int i : l1) {
            System.out.println(i);
        }

//        Iterator<Integer>itr = l1.iterator();
//            while(itr.hasNext()) {
//                System.out.println(itr.next());
//            }

    }
}
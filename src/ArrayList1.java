import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>(5);
        l1.add(23);
        l1.add(87);
        l1.add(45);
        l1.add(23);
        l1.add(90);
        l1.add(3,78);

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        l1.addAll(2,l2);

//        System.out.println(l1);

        l1.remove(9);
//        l1.clear();

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(23));
        System.out.println(l1.equals(l2));
        Object[] arr = l1.toArray();
        System.out.println(arr);
        System.out.println(l1);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
    }
}


import java.util.List;
import java.util.ArrayList;

public class ArrayListTest5 {
    
    static void print(Object[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+",");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        System.out.println(list1);
//        print(list1.toArray());
        
        List list2 = (List)list1.clone();
        list2.set(0, 100);
        System.out.println(list2);
    }

}
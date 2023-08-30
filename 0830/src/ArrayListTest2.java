
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest2 {
	static void print(List<Integer>list) {
		for(Integer n : list) {
			System.out.print(n+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	   ArrayList<Integer> list1 = new ArrayList<>();
	   list1.add(1);
	   list1.add(2);
	   list1.add(3);
	   list1.add(4);
	   list1.add(5);
	   
	   ArrayList<Integer> list2 = new ArrayList<>(list1);
	   print(list1);
	   print(list2);
	   
	   List<Integer> sublist = list1.subList(2, 4);
	   print(sublist);
	   
	   Collections.sort(list1);
	   print(list1);
	   
	   ArrayList<Person> list3 = new ArrayList<>();
	   list3.add(new Person("hong",30));
	   list3.add(new Person("song",20));
	   list3.add(new Person("gong",25));
	   Collections.sort(list3);
	
	
	}

	

}

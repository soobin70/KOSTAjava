
import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();    //중복허용X, 차례대로 들어가지 않는다.
        hs.add(234);
        hs.add(14);
        hs.add(45);
        hs.add(8);
        hs.add(11);
        for(Integer n: hs) {
            System.out.println(n);
        }
        
        HashSet<Person> ahs = new HashSet<>();
        ahs.add(new Person("홍길동", 100000));
        ahs.add(new Person("김길동", 200000));
        ahs.add(new Person("고길동", 200000));
        ahs.add(new Person("하길동", 100000));

        for(Person p: ahs) {
            System.out.println(p);
        }
    }

}

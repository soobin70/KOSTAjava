package ex11;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student

public class Ex6 {
	static int getGroupCount(TreeSet<Student>tset, int from, int to) {
     SortedSet<Student> ss= tset.subSet(new Student("",0,0,from,from,from), new Student("",0,0,to,to,to));
	 return ss.size();
	}

	public static void main(String[] args) {
	TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getTotal() - o2.getTotal();
//               if(o1.getAverage()>o2.getAverage()) return 1;
//               else if (o1.getAverage()<o2.getAverage()) return -1;
// 				else return 0;
				}
		});
//	    TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}

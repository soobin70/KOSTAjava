package com.test01;

import java.util.ArrayList;
import java.util.List;

class Human {
	String name;
	int age;
	int height;
	int weigth;

	Human() {
	}

	Human(String name, int age, int height, int weigth) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "이름:" + this.name + ",나이:" + this.age + ",신장:" + this.height + ",체중:" + this.weigth;
	}
}

class Student extends Human {
	String major;
	int grade;

	Student() {
	}

	Student(String name, int age, int height, int weigth, int grade, String major) {
		super(name, age, height, weigth);
		this.major = major;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return super.toString() + ",학번:" + grade + ",전공:" + major; // super.info() //부모꺼 호출
	}

}

public class TestStudent extends Human {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(); // 자식 객체를 통해 부모 클래스의 속성과 메서드를 사용할 수 있다
//		stud1.name = "홍길동";
//		stud1.age = 20;
//		stud1.height= 177;
//		stud1.weigth=74;
//		stud1.grade= 201301;
//		stud1.major = "체육";
		list.add(new Student("홍길동", 20, 177, 74, 201301, "체육"));
		list.add(new Student("이순신", 44, 178, 77, 201302, "체육"));
		list.add(new Student("유관순", 18, 155, 45, 201303, "컴퓨터"));

		for (Student s : list) {
			System.out.println(s);
		}
	}
}
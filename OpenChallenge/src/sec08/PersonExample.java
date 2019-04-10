package sec08;

import java.time.LocalDate;
import java.util.TreeSet;

public class PersonExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person(1, "강진희", "부장", LocalDate.of(2016, 1, 12)));
		treeSet.add(new Person(5, "홍민지", "과장", LocalDate.of(2015, 1, 12)));
		treeSet.add(new Person(6, "강미미", "과장", LocalDate.of(2019, 2, 12)));
		treeSet.add(new Person(7, "이라라", "대리", LocalDate.of(2017, 9, 12)));
		treeSet.add(new Person(2, "노연아", "부장", LocalDate.of(2016, 7, 12)));
		treeSet.add(new Person(3, "정정화", "차장", LocalDate.of(2017, 3, 12)));
		treeSet.add(new Person(4, "천세은", "차장", LocalDate.of(2016, 9, 12)));
		treeSet.add(new Person(8, "김자바", "대리", LocalDate.of(2018, 10, 12)));
		treeSet.add(new Person(9, "이철수", "사원", LocalDate.of(2019, 1, 30)));
		treeSet.add(new Person(10, "박영희", "사원", LocalDate.of(2018, 11, 28)));
		
		for(Person p : treeSet)
			System.out.println(p);
	}

}

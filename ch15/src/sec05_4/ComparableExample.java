package sec05_4;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		Person p1 = new Person("홍길동", 45);
		Person p2 = new Person("홍길동", 45);
		if(p1.equals(p2))
				System.out.println("equals true");
		System.out.println("p1.hashCode() is " + p1.hashCode());
		System.out.println("p2.hashCode() is " + p1.hashCode());
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("홍길동", 35));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
		System.out.println();
		
		for(Person person : treeSet) 
			System.out.println(person.name + " : " + person.age);
	}

}

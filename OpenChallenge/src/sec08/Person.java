package sec08;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
	int num;
	String name;
	String position;
	LocalDate date;
	
	public Person(int num, String name, String position, LocalDate date) {
		this.num = num;
		this.name = name;
		this.position = position;
		this.date = date;
	}
	
	@Override
	public int compareTo(Person o) {
		Posit posit1 = Posit.valueOf(position);
		Posit posit2 = Posit.valueOf(o.position);
		
		if(posit1.compareTo(posit2) > 0) return 1;
		if(posit1.compareTo(posit2) < 0) return -1;

		if(date.isAfter(o.date)) return 1;	
		else return -1;
	}

	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", position=" + position + ", date=" + date + "]";
	}

}

package chap28_Comparable;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person otherPerson) {
	//³ªÀÌ¸¦ ±âÁØÀ¸·Î ºñ±³
		return this.age -otherPerson.age;
	}
	
	@Override
	public String toString() {
		return "Person age = "+  age + " name = " +name;
	}

}
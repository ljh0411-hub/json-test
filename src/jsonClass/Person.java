package jsonClass;
/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020��4��27�� ����3:57:12

 */
public class Person {
	private int age;
	private String name;
	private Address address;
	
	
	public Person() {
		super();
	}


	public Person(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

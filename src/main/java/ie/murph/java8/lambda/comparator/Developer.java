package ie.murph.java8.lambda.comparator;

import java.math.BigDecimal;

public class Developer {

	private String name;
	private BigDecimal wages;
	private int age;
	
	public Developer() {}
	public Developer(String name, BigDecimal wages, int age) 
	{
		this.name = name;
		this.wages = wages;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getWages() {
		return wages;
	}
	public void setWages(BigDecimal wages) {
		this.wages = wages;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "\n Developer Name: " + name + "\n Wages: " + wages + "\n Age: " + age;
	}
	
}

package ie.murph.java8.lambda.comparator;

import java.util.List;

public class LambdaSorting {

	private List<Developer> list;
	
	public LambdaSorting(List<Developer> list)
	{
		this.list = list;
	}
	
	public void sortDeveloperByAgeWithParameterType()
	{
		list.sort((Developer first, Developer second) -> first.getAge() - second.getAge());
	}
	
	public void sortDeveloperByAgeWithOutParameterType()
	{
		list.sort((first, second) -> first.getAge() - second.getAge());
	}
	
	public void sortDeveloperByNameWithParameterType()
	{
		list.sort((Developer first, Developer second) -> first.getName().compareToIgnoreCase(second.getName()));
	}
	
	public void sortDeveloperByWagesWithOutParameterType()
	{
		list.sort((first, second) -> first.getWages().compareTo(second.getWages()));
	}
	
	public void sortDeveloperByWagesWithParameterType()
	{
		list.sort((Developer first, Developer second) -> first.getWages().compareTo(second.getWages()));
	}
	
	public void printListOfDevelopers(String message)
	{
		System.out.println("\n" + message);
		list.forEach(System.out::println);
	}
	
}

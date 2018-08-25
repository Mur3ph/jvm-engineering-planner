package ie.murph.java8.lambda.comparator;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Java7Sorting {

	private List<Developer> list;
	
	public Java7Sorting(List<Developer> list) {
		this.list = list;
	}
	
	public void sortDeveloperByAge()
	{
		Collections.sort(this.list, new Comparator<Developer>(){
			@Override
			public int compare(Developer first, Developer second) {
				return first.getAge() - second.getAge();
			}
		});
	}
	
	public void sortDeveloperByName()
	{
		Collections.sort(this.list, new Comparator<Developer>() {
			@Override
			public int compare(Developer first, Developer second) {
				return first.getName().compareToIgnoreCase(second.getName());
			}
		});
	}
	
	public void sortDeveloperByWages()
	{
		Collections.sort(this.list, new Comparator<Developer>() {
			@Override
			public int compare(Developer first, Developer second)
			{
				return first.getWages().compareTo(second.getWages());
			}
		});
	}
	
	public void printListOfDevelopers(String message)
	{
		System.out.println("\n" + message);
		for(Developer developer : list)
		{
			System.out.println(developer);
		}
	}
	
}

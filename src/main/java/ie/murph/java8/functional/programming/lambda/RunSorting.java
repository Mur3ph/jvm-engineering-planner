package main.java.ie.murph.java8.functional.programming.lambda;

import main.java.ie.murph.java8.functional.programming.lambda.comparator.Java7Sorting;
import main.java.ie.murph.java8.functional.programming.lambda.comparator.LambdaSorting;

public class RunSorting {
	
	private static Java7Sorting java7Sorting;
	private static LambdaSorting lambdaSorting;

	public static void main(String[] args)
	{
		sortListOfDevelopersByAgeWithoutLambda();
		sortListOfDevelopersByNameWithoutLambda();
		sortListOfDevelopersByWagesWithoutLambda();
		
		sortListOfDevelopersByAgeUsingLambda();
		sortListOfDevelopersByNameUsingLambda();
		sortListOfDevelopersByWagesUsingLambda();
	}

	private static void sortListOfDevelopersByAgeWithoutLambda() 
	{
		System.out.println("\nSorting Without Lambda\n");
		java7Sorting = new Java7Sorting(CreateDeveloperGUI.getListOfDevelopers());
		java7Sorting.printListOfDevelopers("Before sorting..");
		java7Sorting.sortDeveloperByAge();
		java7Sorting.printListOfDevelopers("After sorting..");
	}
	
	private static void sortListOfDevelopersByNameWithoutLambda() 
	{
		System.out.println("\nSorting Without Lambda\n");
		java7Sorting = new Java7Sorting(CreateDeveloperGUI.getListOfDevelopers());
		java7Sorting.printListOfDevelopers("Before sorting..");
		java7Sorting.sortDeveloperByName();
		java7Sorting.printListOfDevelopers("After sorting..");
	}
	
	private static void sortListOfDevelopersByWagesWithoutLambda() 
	{
		System.out.println("\nSorting Without Lambda\n");
		java7Sorting = new Java7Sorting(CreateDeveloperGUI.getListOfDevelopers());
		java7Sorting.printListOfDevelopers("Before sorting..");
		java7Sorting.sortDeveloperByWages();
		java7Sorting.printListOfDevelopers("After sorting..");
	}
	
	private static void sortListOfDevelopersByAgeUsingLambda() 
	{
		System.out.println("\nSorting With Lambda");
		lambdaSorting = new LambdaSorting(CreateDeveloperGUI.getListOfDevelopers());
		lambdaSorting.printListOfDevelopers("Before sorting..");
		lambdaSorting.sortDeveloperByAgeWithParameterType();
		lambdaSorting.printListOfDevelopers("After sorting..");
	}
	
	private static void sortListOfDevelopersByNameUsingLambda() 
	{
		System.out.println("\nSorting With Lambda");
		lambdaSorting = new LambdaSorting(CreateDeveloperGUI.getListOfDevelopers());
		lambdaSorting.printListOfDevelopers("Before sorting..");
		lambdaSorting.sortDeveloperByNameWithParameterType();
		lambdaSorting.printListOfDevelopers("After sorting..");
	}
	
	private static void sortListOfDevelopersByWagesUsingLambda() 
	{
		System.out.println("\nSorting With Lambda");
		lambdaSorting = new LambdaSorting(CreateDeveloperGUI.getListOfDevelopers());
		lambdaSorting.printListOfDevelopers("Before sorting..");
		lambdaSorting.sortDeveloperByWagesWithParameterType();
		lambdaSorting.printListOfDevelopers("After sorting..");
	}
	
}

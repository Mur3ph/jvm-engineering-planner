package main.java.ie.murph.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import main.java.ie.murph.java8.lambda.comparator.Developer;

public final class CreateDeveloperGUI {

	private CreateDeveloperGUI() {}
	
	public static List<Developer> getListOfDevelopers() {
		List<Developer> developers = new ArrayList<>();
		
		developers.add(new Developer("Murphy", new BigDecimal("35000"), 38));
		developers.add(new Developer("Minnie", new BigDecimal("40000"), 28));
		developers.add(new Developer("Lola", new BigDecimal("15000"), 1));
		developers.add(new Developer("Angie", new BigDecimal("135000"), 70));
		developers.add(new Developer("Ger", new BigDecimal("225000"), 73));
		
		return developers;
	}
	
}

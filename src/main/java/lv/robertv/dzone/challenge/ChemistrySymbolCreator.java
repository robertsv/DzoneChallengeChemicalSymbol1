package lv.robertv.dzone.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a chemistry symbol creator to get a first (alphabetical order) valid
 * symbol. Dzone challenge:
 * https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * 
 * @author Roberts Vartins
 */
public class ChemistrySymbolCreator {

	public String genFirstSymbol(String elementName) {
		
		elementName = elementName.toLowerCase();
		
		String symbolChar1 = getFirstSymbol(elementName, true);
		
		elementName = elementName.substring(elementName.indexOf(symbolChar1) + 1);
		
		String symbolChar2 = getFirstSymbol(elementName, false);

		return symbolChar1.toUpperCase() + symbolChar2;
	}

	private String getFirstSymbol(String elementName, boolean firstSymbol) {
		
		// here we create a list of character in alphabetical order
		List<String> splittedName = Arrays.asList(elementName.split(""));

		List<String> splittedSortedName = splittedName.stream()
				.sorted((object1, object2) -> object1.compareTo(object2))
				.collect(Collectors.toList());
		
		String symbol = splittedSortedName.get(0);
		
		// if we looking for the first symbol then it can not be last character in given name
		// if it is so then we are taking the next symbol
		if (firstSymbol && elementName.indexOf(symbol) == elementName.length() - 1) {
			symbol = splittedSortedName.get(1);
		}

		return symbol;
	}
}

package lv.robertsv.dzone.challenge;

/**
 * This is a chemistry validator.
 * Dzone challenge: https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * @author Roberts Vartins
 */
public class ChemistrySymbolValidator {
	
	public boolean isValidSymbol(String elementName, String symbol) {
		
		elementName = elementName.toLowerCase();
		symbol = symbol.toLowerCase();
		
		// rule #1
		boolean rule1 = symbol.length() == 2;
		
		// rule #2, #3 and #4
		String symbolChar1 = Character.toString(symbol.charAt(0));
		String symbolChar2 = Character.toString(symbol.charAt(1));
		
		boolean rule2and3and4 = elementName.contains(symbolChar1) && elementName.substring(elementName.indexOf(symbolChar1) + 1).contains(symbolChar2);
		
		return rule1 && rule2and3and4;
	}
	
}

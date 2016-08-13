package lv.robertv.dzone.challenge;

import java.util.Arrays;
import java.util.List;

/**
 * This is a chemistry symbol counter to number of distinct valid symbols. Dzone challenge:
 * https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * 
 * @author Roberts Vartins
 */
public class ChemistrySymbolCounter {

	public int getDistinctSymbolCnt(String elementName) {
		
		elementName = elementName.toLowerCase();
		
		int cnt = 0;
		int endIndex = elementName.length() - 1;
		
		// if there would be no requirement for distinct symbols then "nr. of elements" = n - 1 + n - 2 + ... + 0
		// but we need to filter out duplicates
		for (int currentIndex = 0; currentIndex <= endIndex; currentIndex++) {
			String currentChar = Character.toString(elementName.charAt(currentIndex));
			// get all remaining chars till end or till char which equals current character
			String remainingChars = elementName.substring(currentIndex + 1);
			int index = remainingChars.indexOf(currentChar);
			if (index > -1) {
				remainingChars = remainingChars.substring(0, index + 1);
			}
			// get nr. of possible combinations for current character
			cnt += getDistinctCharCnt(remainingChars);
		}
		
		return cnt;
	}
	
	private int getDistinctCharCnt(String elementName) {
		String str = "";
		List<String> splittedName = Arrays.asList(elementName.split(""));
		int index = 0;
		for (String character : splittedName) {
			index++;
			List<String> prev = splittedName.subList(0, index - 1);
			if (index !=0 && !prev.contains(character)) {
				str += character;
			}
		}
		return str.length();
	}

}

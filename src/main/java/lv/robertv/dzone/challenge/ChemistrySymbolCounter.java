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
		
		for (int index = 0; index <= endIndex; index++) {
			
			String currnetChar = Character.toString(elementName.charAt(index));
			String charsBehindIt = elementName.substring(index + 1);
			
			int till = charsBehindIt.indexOf(currnetChar);
			if (till > -1) {
				charsBehindIt = charsBehindIt.substring(0, till + 1);
			}
			
			cnt += getDistinctCharCnt(charsBehindIt);
		}
		
		return cnt;
	}
	
	private int getDistinctCharCnt(String elementName) {
		String str = "";
		List<String> splittedName = Arrays.asList(elementName.split(""));
		int index = 0;
		for (String cahr : splittedName) {
			index++;
			List<String> prev = splittedName.subList(0, index - 1);
			if (index !=0 && !prev.contains(cahr)) {
				str += cahr;
			}
		}
		return str.length();
	}

}

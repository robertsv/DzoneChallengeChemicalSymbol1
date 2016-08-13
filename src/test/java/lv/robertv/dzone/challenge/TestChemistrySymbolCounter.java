package lv.robertv.dzone.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class for a chemistry symbol counter. Dzone challenge:
 * https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * 
 * @author Roberts Vartins
 */
public class TestChemistrySymbolCounter {

	private ChemistrySymbolCounter counter;

	@Before
	public void setUp() {
		counter = new ChemistrySymbolCounter();
	}

	@Test
	public void getDistinctSymbolCnt1() {
		Assert.assertEquals(11, counter.getDistinctSymbolCnt("Zuulon"));
	}

}

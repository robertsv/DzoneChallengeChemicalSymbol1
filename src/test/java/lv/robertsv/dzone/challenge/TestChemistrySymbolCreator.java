package lv.robertsv.dzone.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lv.robertsv.dzone.challenge.ChemistrySymbolCreator;

/**
 * This is a test class for a chemistry symbol creator. 
 * Dzone challenge: https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * @author Roberts Vartins
 */
public class TestChemistrySymbolCreator {
	
	private ChemistrySymbolCreator creator;
	
	@Before
	public void setUp()
	{
		creator = new ChemistrySymbolCreator();
	}
	
	@Test
	public void genFirstSymbol1() {
		Assert.assertEquals("Ei", creator.genFirstSymbol("Gozerium"));
	}
	
	@Test
	public void genFirstSymbol2() {
		Assert.assertEquals("Ie", creator.genFirstSymbol("Slimyrine"));
	}
	
}

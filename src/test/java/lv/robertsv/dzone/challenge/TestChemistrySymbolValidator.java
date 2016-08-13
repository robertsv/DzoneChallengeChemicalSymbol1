package lv.robertsv.dzone.challenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lv.robertsv.dzone.challenge.ChemistrySymbolValidator;

/**
 * This is a test class for a chemistry validator. 
 * Dzone challenge: https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on
 * @author Roberts Vartins
 */
public class TestChemistrySymbolValidator {
	
	private ChemistrySymbolValidator validator = new ChemistrySymbolValidator();
	
	@Before
	public void setUp()
	{
		validator = new ChemistrySymbolValidator();
	}
	
	@Test
	public void isValidSymbol1() {
		Assert.assertTrue(validator.isValidSymbol("Spenglerium", "Ee"));
	}
	
	@Test
	public void isValidSymbol2() {
		Assert.assertTrue(validator.isValidSymbol("Zeddemorium", "Zr"));
	}
	
	@Test
	public void isValidSymbol3() {
		Assert.assertTrue(validator.isValidSymbol("Venkmine", "Kn"));
	}
	
	@Test
	public void isValidSymbol4() {
		Assert.assertFalse(validator.isValidSymbol("Stantzon", "Zt"));
	}
	
	@Test
	public void isValidSymbol5() {
		Assert.assertFalse(validator.isValidSymbol("Melintzum", "Nn"));
	}
	
	@Test
	public void isValidSymbol6() {
		Assert.assertFalse(validator.isValidSymbol("Tullium", "Ty"));
	}
	
}

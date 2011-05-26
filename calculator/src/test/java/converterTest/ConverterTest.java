package converterTest;

import static org.junit.Assert.*;

import org.junit.Test;

import converter.Converter;
import converter.StringConverter;

public class ConverterTest{
	
	@Test
	public void convertStringToInt(){
		Converter converter = new StringConverter();
		int result = converter.convertToInt("5");
		
		assertEquals("String converted to int", 5, result);
	}
	
	@Test
	public void convertIntToString(){
		Converter converter = new StringConverter();
		String result = converter.convertToString(6);
		
		assertEquals("String converted to int", "6", result);
	}

}

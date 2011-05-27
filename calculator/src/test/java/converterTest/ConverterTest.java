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
		
		assertEquals("Int converted to string", "6", result);
	}

	@Test
	public void convertStringToArray(){
		Converter converter = new StringConverter();
		String[] result = converter.convertStringToArray("123");
		
		String[] expected = {"1","2","3"};
		assertArrayEquals("String  converted to array of strings", expected, result);
	}
	
	@Test
	public void convertStringArrayToIntArray(){
		String[] stringArray = {"1","2","3"};
		Converter converter = new StringConverter();
		int[] result = converter.convertStringArrayToIntArray(stringArray);
		
		int[] expected = {1,2,3};
		assertArrayEquals("String array converted to int array", expected, result);
	}
	
	@Test
	public void invertArray(){
		int[] array = {1,2,3};
		Converter converter = new StringConverter();
		int[] result =converter.invertArray(array);
		
		int[] expected = {3,2,1};
		
		assertArrayEquals("Invert array", expected, result);
	}
	
}

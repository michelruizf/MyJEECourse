package converter;

public class StringConverter implements Converter {

	public int convertToInt(String stringToInt) {
		return Integer.parseInt(stringToInt);
	}

	public String convertToString(int intToString) {
		return String.valueOf(intToString);
	}

}

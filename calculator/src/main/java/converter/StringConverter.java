package converter;

public class StringConverter implements Converter {

	public int convertToInt(String stringToInt) {
		return Integer.parseInt(stringToInt);
	}

	public String convertToString(int intToString) {
		return String.valueOf(intToString);
	}

	public String[] convertStringToArray(String stringToArray) {
		String[] result = new String[stringToArray.length()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = String.valueOf(stringToArray.charAt(i));
		}
		return result;
	}

	public int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] result = new int[stringArray.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(stringArray[i]);
		}
		return result;
	}
}

package converter;

public interface Converter {

	int convertToInt(String stringToInt);

	String convertToString(int intToString);

	String[] convertStringToArray(String stringToArray);

	int[] convertStringArrayToIntArray(String[] stringArray);

}

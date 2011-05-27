package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCalculator {
	
	private int[] smallerArray;
	private int[] largerArray;

	public List<Integer> addArrays(int[] arrayLeft, int[] arrayRight) {
		
		int rest = 0;
		List<Integer> result = new ArrayList<Integer>();
		
		defineSizeOfArrays(arrayLeft, arrayRight);
		
		for (int i = this.smallerArray.length; i > 0; i--) {
			
			int sum = smallerArray[i] + largerArray[i] + rest;
			if(sum > 9){
				result.add(sum % 10);
				rest = sum / 10;
			}else{
				result.add(sum);
			}
		}
		
		return result;
	}

	private void defineSizeOfArrays(int[] arrayLeft, int[] arrayRight) {
		
		if(arrayLeft.length > arrayRight.length){
			this.smallerArray = arrayRight;
			this.largerArray = arrayLeft;
		}else{
			this.smallerArray = arrayLeft;
			this.largerArray = arrayRight;
		}
	}

}

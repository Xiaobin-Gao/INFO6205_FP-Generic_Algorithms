package genetic_algorithm;

import java.util.Map;

public class Encode {
	
	private static int[] location;
	
	public static int[] execute(int[] target) {
	
		location = new int[target.length];
		for (int i = 0; i < location.length; i++) {
			location[i] = i;
		}
	
		int temp;
		for (int j = 0; j < target.length; j++) {
			int max = 0;
			for (int k = j + 1; k < target.length; k++) {
				if (target[k] > target[max]) max = k;
			}
			temp = target[j];
			target[j] = target[max];
			target[max] = temp;
			
			temp = location[j];
			location[j] = location[max];
			location[max] = temp;
		}
		return location;
	}
}

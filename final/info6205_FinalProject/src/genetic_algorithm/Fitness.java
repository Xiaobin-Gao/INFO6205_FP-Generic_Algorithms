package genetic_algorithm;

public class Fitness {
	

	/**
	 * To calculate fitness
	 * @param individual an individual's information
	 * @return fitness
	 */
	public static int calculate(int[] individual) {
		int fitness = 0;
		for (int i = 0; i < individual.length; i++) {
			fitness = fitness + individual[i]; 
		}
		return fitness;
	}
}

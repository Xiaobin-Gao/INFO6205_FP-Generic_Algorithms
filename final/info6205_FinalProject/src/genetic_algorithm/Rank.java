package genetic_algorithm;

public class Rank {
	
	private static int[] fits;
	
	public static int[][] execute(int[][] population) {
		fits = new int[population.length];
		for (int i = 0; i < population.length; i++) {
			fits[i] = Fitness.calculate(population[i]);
		}
		
		for (int j = 0; j < fits.length; j++) {
			int max = 0;
			for (int k = j + 1; k < fits.length; k++) {
				if (fits[k] > fits[max]) max = k;
			}
			int temp = fits[j];
			fits[j] = fits[max];
			fits[max] = temp;
			
			int[] temps = population[j];
			population[j] = population[max];
			population[max] = temps;	
		}
		return population;
	}
}

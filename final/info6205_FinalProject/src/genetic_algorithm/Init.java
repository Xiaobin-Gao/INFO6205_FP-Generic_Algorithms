package genetic_algorithm;

public class Init {
	
	private Point[] target; // target individual
	private int sizeOfPop; // size of population
	private int sizeOfChro; // size of chromosomes, a single chromosome consists of 4 DNAs
	private Point[][] population; // all individuals
	private int range; // range of a single DNA
	
	public Init(Point[] target, int size, int range) {
		this.target = target;
		sizeOfPop = size;
		sizeOfChro = target.length / 4;
		this.range = range;
	}
	
	public Point[] getTarget() {
		return target;
	}
	
	public Point[][] producePop() {
		population = new Point[sizeOfPop][sizeOfChro * 4];
		for (int i = 0; i < sizeOfPop; i++) {
			for (int j = 0; j < sizeOfChro; j++) {
				int random = (int)Math.random();
				//population[i][j] = range * random;
			}
		}
		return population;
		
		
	}
}

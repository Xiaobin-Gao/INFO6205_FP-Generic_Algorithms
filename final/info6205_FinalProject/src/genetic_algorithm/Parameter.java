package genetic_algorithm;

import java.awt.image.BufferedImage;
public class Parameter {
	
	public int width;
	public int height;
	public int genNumber;
	public int popNumber;
	
	public BufferedImage target;
	
	public Parameter(int width, int height, BufferedImage target, int genNumber, int popNumber) {
		
		this.width = 200;
		this.height = 200;
		this.target = target;
		this.genNumber = genNumber;
		this.popNumber = popNumber;

	}
	
	
}

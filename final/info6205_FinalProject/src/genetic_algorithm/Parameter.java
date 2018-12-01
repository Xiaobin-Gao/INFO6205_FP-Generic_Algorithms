package genetic_algorithm;

import java.awt.image.BufferedImage;
public class Parameter {
	
	public int width;
	public int height;
	public BufferedImage target;
	
	public Parameter(int width, int height, BufferedImage target) {
		
		this.width = 200;
		this.height = 200;
		this.target = target;
	}
	
	
}

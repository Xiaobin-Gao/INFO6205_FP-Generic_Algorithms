package genetic_algorithm;

import java.awt.image.BufferedImage;
public class Parameter {
	
	public int default_width = 200;
	public int default_height = 200;
	public BufferedImage targetIm;
	public int[][] target;

	public Parameter(String path) {
	
		this.targetIm = targetIm;
		target = new int[default_width][default_height];
	}
	
	public Parameter(int width, int height, BufferedImage targetIm) {
		
		this.default_width = 200;
		this.default_height = 200;
		this.targetIm = targetIm;
	//
		////
		//
	}
	
	
}

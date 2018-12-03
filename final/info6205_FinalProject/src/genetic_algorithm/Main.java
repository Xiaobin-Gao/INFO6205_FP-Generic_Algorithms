package genetic_algorithm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedImage img = ImageIO.read(new File("target.png"));
//		int [][] data = new int[img.getWidth()][img.getHeight()];
//		for(int i=0;i<img.getWidth();i++){
//            for(int j=0;j<img.getHeight();j++){
//                data[i][j]=img.getRGB(i,j);
//                if(i==0)
//                    System.out.print(data[i][j]);
//            }
//        }
		createImage();

		
	}
	public static void createImage() throws FileNotFoundException, IOException {
		Random rd = new Random();
		BufferedImage b = new BufferedImage(245, 245, BufferedImage.TYPE_INT_RGB);
		b.getGraphics().setColor(Color.BLACK);
		Graphics g = b.getGraphics();
		Color[][] arr = new Color[100][100];
		
		for(int n = 0; n< 100; n++) {
			for(int m = 0; m< 100; m++) {
				arr[n][m] = new Color(rd.nextInt(256), rd.nextInt(256), rd.nextInt(256));
				g.setColor(arr[n][m]);
				g.fillRect(n*10, m*10, 10, 10);
			}
		}
		ImageIO.write(b, "png", new FileOutputStream(new File("test.png")));
	}

}

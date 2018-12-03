package ga;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ga.alg.Breed;
import ga.alg.Fitness;
import ga.gene.Point;

import static org.junit.Assert.assertEquals;
@SuppressWarnings("All")

class PointTest {

	@Test
	public void testPoint() throws Exception{
		Point p1 = new Point(3, 4);
		Point p2 = new Point(5, 6);
		Point p3 = new Point(3, 4);
		Point p4 = new Point(10, 0);
		
		double d1 = Point.distance(p1, p2);
		double d2 = Point.distance(p3, p4);
	   
	    assertEquals(Double.valueOf(2.8284), d1, 1.0);
	    assertEquals(Double.valueOf(8.0623), d2, 1.0);

	}
	
	@Test
	public void testFitness() throws Exception{
		Point p1 = new Point(3, 4);
		Point p2 = new Point(5, 6);
		Point p3 = new Point(3, 4);
		Point p4 = new Point(10, 0);
		
		Point p5 = new Point(3, 4);
		Point p6 = new Point(5, 6);
		Point p7 = new Point(3, 4);
		Point p8 = new Point(10, 0);
		
		Point[] ps = new Point[4];
		Point[] individual = new Point[4];
		ps[0] = p1;
		ps[1] = p2;
		ps[2] = p3;
		ps[3] = p4;
		individual[0] = p5;
		individual[1] = p6;
		individual[2] = p7;
		individual[3] = p8;
		Fitness f1 = new Fitness();
		double result = f1.calDis(ps,individual);		
		assertEquals(0.0, result, 1.0);
		
		Point pp1 = new Point(10, 4);
		Point pp2 = new Point(3, 6);
		Point pp3 = new Point(4, 4);
		Point pp4 = new Point(8, 0);
		
		Point pp5 = new Point(2, 4);
		Point pp6 = new Point(1, 6);
		Point pp7 = new Point(3, 2);
		Point pp8 = new Point(5, 0);
		
		Point[] pps = new Point[4];
		Point[] individual1 = new Point[4];
		
		pps[0] = pp1;
		pps[1] = pp2;
		pps[2] = pp3;
		pps[3] = pp4;
		individual1[0] = pp5;
		individual1[1] = pp6;
		individual1[2] = pp7;
		individual1[3] = pp8;
		Fitness f2 = new Fitness();

		double result2 = f2.calDis(pps,individual1);	
		
		assertEquals(15.23606797749979, result2, 1.0);
	}

}

package ga.gene;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PointTest {
	
	@Test
	public void testToByteAndToPoint0() {
		Point p0 = new Point(40, 50);
		byte[] b0 = p0.toByte();
		Point result = Point.toPoint(b0);
		assertEquals(p0.getX(), result.getX());
		assertEquals(p0.getY(), result.getY());
	}
	
	@Test
	public void testToByteAndToPoint1() {
		Point p1 = new Point(0, 0);
		byte[] b1 = p1.toByte();
		Point result = Point.toPoint(b1);
		assertEquals(p1.getX(), result.getX());
		assertEquals(p1.getY(), result.getY());
	}
	
	@Test
	public void testToByteAndToPoint2() {
		Point p1 = new Point(10, 78);
		byte[] b1 = p1.toByte();
		Point result = Point.toPoint(b1);
		assertEquals(p1.getX(), result.getX());
		assertEquals(p1.getY(), result.getY());
	}
	
	

}

package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;
import java.util.*;

public class RectangleTest {
	

	@Test
	public void testRectangle() {
		Rectangle rec1= new Rectangle (1,2);
		assertEquals(rec1.getiWidth(), 1);
		assertEquals(rec1.getiLength(), 2);
	}

	@Test
	void testArea() {
		Rectangle rec1= new Rectangle (2,3);
		Rectangle rec2= new Rectangle (4,5);
		assertEquals(rec1.area(),6);
		assertEquals(rec2.area(),20);
		
	}

	@Test
	void testPerimeter() {
		Rectangle rec1= new Rectangle (2,3);
		Rectangle rec2= new Rectangle (4,5);
		assertEquals(rec1.perimeter(),10);
		assertEquals(rec2.perimeter(),18);
	}


	@Test
	void testGetiWidth() {
		Rectangle rec1=new Rectangle(10,20);
		int iwidth=10;
		rec1.setiWidth(10);
		int result=rec1.getiWidth();
		assertEquals(iwidth,result);
	}

	@Test
	void testSetiWidth() {
		int iwidth = 10;
	    Rectangle rec1 = new Rectangle(10,20);
	    rec1.setiWidth(10);
	    assertEquals(rec1.getiWidth(), 10);
	}

	@Test
	void testGetiLength() {
		Rectangle rec1=new Rectangle(10,20);
		int ilength=20;
		rec1.setiLength(20);
		int result=rec1.getiLength();
		assertEquals(ilength,result);
	}

	@Test
	void testSetiLength() {
		int ilength = 20;
	    Rectangle rec1 = new Rectangle(10,20);
	    rec1.setiLength(20);
	    assertEquals(rec1.getiLength(), 20);
	}

	@Test
	void testCompareTo() {
		Rectangle rec1=new Rectangle(10,20);
		Rectangle rec2=new Rectangle(20,30);
		Rectangle rec3=new Rectangle(30,40);
		
		assertEquals(rec1.compareTo(rec2),-1);
		assertEquals(rec3.compareTo(rec1),1);
		assertEquals(rec1.compareTo(rec1),0);

	}
	@Test
	void SortByArea() {
		Rectangle rec1=new Rectangle(10,20);
		Rectangle rec2=new Rectangle(20,30);
		Rectangle rec3=new Rectangle(10,15);
		Rectangle.SortByArea rec=rec1.new SortByArea();
		ArrayList<Rectangle> reclist=new ArrayList<>();
		reclist.add(rec1);
		reclist.add(rec2);
		reclist.add(rec3);
		Collections.sort(reclist,rec);
		ArrayList<Rectangle> reclist2=new ArrayList<>();
		reclist2.add(rec1);
		reclist2.add(rec3);
		reclist2.add(rec2);
		assertEquals(reclist,reclist);
	
	}
		
		


}
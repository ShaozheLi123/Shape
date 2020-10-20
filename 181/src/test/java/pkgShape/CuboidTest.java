package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;
import pkgShape.Rectangle.SortByArea;

public class CuboidTest {

	@Test
	void testPerimeter() {
		Cuboid cu1= new Cuboid (2,3,4);
		assertThrows(UnsupportedOperationException.class, () -> cu1.perimeter());	}

	@Test
	void testArea() {
		Cuboid cu1=new Cuboid(2,3,4);
		assertEquals(cu1.area(),52);
	}
	
	void testCuboid() {
		Cuboid cu1= new Cuboid (2,3,4);
		assertEquals(cu1.getiWidth(), 2);
		assertEquals(cu1.getiLength(), 3);
		assertEquals(cu1.getiDepth(), 4);
	}

	@Test
	void testGetiDepth() {
		Cuboid cu1=new Cuboid(10,20,30);
		int idepth=30;
		cu1.setiDepth(30);
		int result=cu1.getiDepth();
		assertEquals(idepth,result);
	}

	@Test
	void testSetiDepth() {
		int idepth = 30;
		Cuboid cu1 = new Cuboid(10,20,30);
	    cu1.setiDepth(30);
	    assertEquals(cu1.getiDepth(), 30);
	}

	@Test
	void testVolume() {
		Cuboid cu1= new Cuboid (2,3,4);
		Cuboid cu2= new Cuboid (4,5,6);
		assertEquals(cu1.area(),24);
		assertEquals(cu2.area(),120);
	}
	@Test
	void testCompareTo() {
		Cuboid cu1=new Cuboid(10,20,30);
		Cuboid cu2=new Cuboid(20,30,40);
		Cuboid cu3=new Cuboid(30,40,50);
		
		assertEquals(cu1.compareTo(cu2),-1);
		assertEquals(cu3.compareTo(cu1),1);
		assertEquals(cu1.compareTo(cu1),0);
	}
	@Test
	void SortByVolume() {
		Cuboid cu1=new Cuboid(10,20,30);
		Cuboid cu2=new Cuboid(20,30,40);
		Cuboid cu3=new Cuboid(10,15,20);
		Cuboid.SortByVolume cu=cu1.new SortByVolume();
		ArrayList<Cuboid> cublist=new ArrayList<>();
		cublist.add(cu1);
		cublist.add(cu2);
		cublist.add(cu3);
		Collections.sort(cublist,cu);
		ArrayList<Cuboid> cublist2=new ArrayList<>();
		cublist2.add(cu1);
		cublist2.add(cu3);
		cublist2.add(cu2);
		assertEquals(cublist,cublist);
	
	}

}

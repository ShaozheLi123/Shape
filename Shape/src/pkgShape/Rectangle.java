package pkgShape;

import java.util.*; 

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;

	public Rectangle (int iWidth, int iLength) {
		super();
	}
	
	@Override
	public double area() {
		return this.iLength*this.iWidth;
	}

	@Override
	public double perimeter() {
		return (this.iLength+this.iWidth)*2;
	}


	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	
	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public int compareTo(Object r) {
		if(this.area()>((Rectangle) r).area()) {
			return 1;
		}
		else if(this.area()==((Rectangle) r).area()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	class SortByArea implements Comparator<Rectangle>{
		public int compare(Rectangle rec1, Rectangle rec2) {
			return rec1.compareTo(rec2);
		}
	}
	

}

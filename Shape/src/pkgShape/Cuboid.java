package pkgShape;

import java.util.*; 


public class Cuboid extends Rectangle {
	private int iDpth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
	}

	public int getiDpth() {
		return iDpth;
	}

	public void setiDpth(int iDpth) {
		this.iDpth = iDpth;
	}
	@Override
	public double area() {
		return this.getiLength()*this.getiWidth();
	}
	@Override
	public double perimeter() {
		return (this.getiLength()+this.getiWidth())*2;
	}
	
	public double volume() {
		return this.area()*this.getiDpth();
	}
	
	public int compareTo(Object c) {
		if(this.area()>((Cuboid) c).area()) {
			return 1;
		}
		else if(this.area()==((Cuboid) c).area()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid cub1, Cuboid cub2) {
			return cub1.compareTo(cub2);
		}
	}

}

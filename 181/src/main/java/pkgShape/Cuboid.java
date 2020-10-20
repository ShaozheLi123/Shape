package pkgShape;

import java.util.*; 


public class Cuboid extends Rectangle {
	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth=iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	@Override
	public double area() {
		return 2*((this.getiLength()*this.getiWidth())+(this.getiLength()*this.getiDepth())+(this.getiDepth()*this.getiWidth()));
	}
	@Override
	public double perimeter()throws UnsupportedOperationException{
		throw new UnsupportedOperationException("message");
	}
	
	public double volume() {
		return this.getiDepth()*this.getiWidth()*this.getiLength();
	}
	
	public int compareTo(Object c) {
		if(this.volume()>((Cuboid) c).volume()) {
			return 1;
		}
		else if(this.volume()==((Cuboid) c).volume()) {
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

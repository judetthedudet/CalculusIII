
public class Vector extends Point{

	//constructors
	public Vector() {
		x=0;
		y=0;
		z=0;
	}
	public Vector(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Vector(Point p){
		this.x=p.x;
		this.y=p.y;
		this.z=p.z;
	}
	//getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	//setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	protected String print() {
		return "<"+x+","+y+","+z+">";
	}
	//addition
	public Vector addition(Vector a) {
		x=this.x+a.getX();
		y=this.y+a.getY();
		z=this.z+a.getZ();
		Vector add=new Vector(x,y,z);
		return add;
	}
	//dot product
	public double dot(Vector a) {
		return this.x*a.getX()+this.y*a.getY()+this.z+a.getZ();
	}
	//cross product
	public Vector cross(Vector a) {
		x=this.y*a.z-this.z*a.y;
		y=this.x*a.z-this.z*a.x;
		z=this.x*a.y-this.y*a.x;
		Vector cross=new Vector(x,y,z);
		return cross;
	}
	//vector length
	public double length() {
		return Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)));
	}
	//unit vector
	public Vector unit() {
		double l=this.length();
		double a=x/l;
		double b=y/l;
		double c=z/l;
		Vector unit=new Vector(a,b,c);
		return unit;
	}
}

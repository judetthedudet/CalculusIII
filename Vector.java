import java.util.*;
public class Vector {
	protected double y;
	protected double x;
	protected double z;
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
	private String print() {
		return "<"+x+","+y+","+z+">";
	}
	//addition
	private Vector addition(Vector a) {
		x=this.x+a.getX();
		y=this.y+a.getY();
		z=this.z+a.getZ();
		Vector add=new Vector(x,y,z);
		return add;
	}
	//dot product
	private double dot(Vector a) {
		return this.x*a.getX()+this.y*a.getY()+this.z+a.getZ();
	}
	//cross product
	private Vector cross(Vector a) {
		x=this.y*a.z-this.z*a.y;
		y=this.x*a.z-this.z*a.x;
		z=this.x*a.y-this.y*a.x;
		Vector cross=new Vector(x,y,z);
		return cross;
	}
	//vector length
	private double length() {
		return Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)));
	}
	//unit vector
	private Vector unit() {
		double a=x/this.length();
		double b=y/this.length();
		double c=z/this.length();
		Vector unit=new Vector(a,b,c);
		return unit;
	}
}

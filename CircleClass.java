package org.classtask6;
//Create a class  circle class with  radius as data member.
//Create two constructors  (no argument, and two arguments) and a method to calculate Circumference.
public class CircleClass {
private double radius;
public CircleClass() {
	this.radius = 1.0;
}
CircleClass(String name, double radius){
	this.radius=radius;
}
public double calculateCircumferance() {
	return 2*Math.PI*radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public static void main(String[] args) {
	CircleClass c1 = new CircleClass();
	System.out.println("Circle 1 - Radius = "+c1.getRadius()+" Circumferance: "+c1.calculateCircumferance() );
	CircleClass c2 = new CircleClass("Circle 2 ",5.0);
	System.out.println("Circle 2 - Radius = "+c2.getRadius()+" Circumferance: "+c2.calculateCircumferance() );
}
}

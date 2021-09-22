/**
 * 
 */
package reflection;

/**
 * @author Jiayue.Ma 
 * * I am group with ZakharovTatiana. We worked together. However, we have some different idea regarding some methods.
 * Then we decide to submit the assignment separately with different methods. 
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {

	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		
		//System.out.println("centerX = "+centerX +"centerY = " + centerY + "radius = " + radius );
		
		return "Circle: centerX = "+ centerX + " centerY = " + centerY + " radius = " + radius;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		
			if (this == obj)
			return true;
			
			if (obj == null)
			return false;
			
			if (getClass() != obj.getClass())
			return false;
			
			Circle other = (Circle) obj;
			
			if (Math.abs(centerX - other.centerX) >0.000001)
			return false;
			
			if (Math.abs(centerY - other.centerY) >0.000001) 			
			return false;
			
			if (Math.abs(radius - other.radius) >0.000001) 
			return false;
			
			if(windowNumber != other.windowNumber)
			return false;
			
			return true;
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	// @Override
	 protected Circle clone() throws CloneNotSupportedException {
		 
		 Circle newCircle = new Circle();
		 
		 newCircle.centerX = this.centerX;
		 newCircle.centerY = this.centerY;
		 newCircle.radius = this.radius;
		 newCircle.windowNumber = this.windowNumber;
		 
		 return newCircle;
	 }

}

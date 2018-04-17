public class Circle {
	
	int radius;
	double diameter ;
	double area ;
	  float circum;
 
	 
	public Circle(int radius, double diameter, double area, float circum) {
		//super();
		this.radius = radius;
		this.diameter = diameter;
		this.area = area;
		this.circum = circum;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;

}
	public void setRadius(double radius) {
     this.radius = (int) radius;
	}
	
	public void Calculatediameter() {
       diameter = 2 * radius;
       
       
	}

	 public void Area() {
		 area = 3.14*radius * radius;
	 }
	  public void Circumference(int radius) {
		
		  circum = (int) (2 *3.14 *radius);
		  
	  }
	  
	  public void print() {
		  System.out.println("radius : "+radius);
		  System.out.println("diameter :"+diameter);
		  System.out.println("area : "+area);
		  System.out.println("CIrcumferernce: "+circum);
	  }
	
}

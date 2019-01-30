/***** Author: Marcelo Mariduena *****/

public class Circle2DMarceloMariduena {
  /* Declaring variables */
  private double x, y, radius;
  /* Constructor with default values for new objects without parameters. */
  public Circle2DMarceloMariduena(){
    this.x = 0;
    this.y = 0;
    this.radius = 1;
  }
  public Circle2DMarceloMariduena(double x, double y, double radius){
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  /* Setters */
  public void setX(double x){
    this.x = x;
  }
  public void setY(double y){
    this.y = y;
  }
  public void setReadius(double radius){
    this.radius = radius;
  }
  /* Getters */
  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }
  public double getRadius(){
    return this.radius;
  }
  /* Methods gets the distance between the centers of the circles. 
  The parameters should recieve a Circle2D object */
  public double getDistance(Circle2DMarceloMariduena otherCircle){
    return Math.sqrt( Math.pow((x - otherCircle.getX()), 2) +  Math.pow((y - otherCircle.getY()), 2));
  }
  /* This method returns the minimum distance between the radius and the new points */
  public double getDistance(double x, double y){
    return Math.sqrt( Math.pow((this.x - x), 2) +  Math.pow((this.y - y), 2));
  }
  /* This method returns the area of the circle */
  public double getArea(){
    return Math.PI * radius * radius;
  }
  /* This method returns the perimeter */
  public double getPerimeter(){
    return 2 * Math.PI * radius;
  }
  
  /* This method returns true if the specified point is inside the circle. */
  public boolean contains(double x, double y){
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) < radius;
  }
  
  /* This method returns true if the other circle object is within this circle */
  public boolean contains(Circle2DMarceloMariduena circle){
    return Math.sqrt(Math.pow(x - circle.getX(), 2) + Math.pow(y - circle.getY(), 2)) <= Math.abs(radius - circle.getRadius());
  }
  
  /* This method returns true if the other circle object overlaps this circle */
  public boolean overlaps(Circle2DMarceloMariduena circle){
    return Math.sqrt(Math.pow(x - circle.getX(), 2) + Math.pow(y - circle.getY(), 2)) <= radius + circle.getRadius();
  }
  
  
  /* This method returns wether or not the points are within this circle */
  
  
}
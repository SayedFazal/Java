class Rectangle{
  double length;
  double width;
  Rectangle(double l, double w){
    length = l;
    width = w;
  }
  double area(){
    return length * width;
  }
}
public class R192311291{
  public static void main(String[] args) {
  Rectangle r = new Rectangle(5, 3); // length = 5, width = 3
  System.out.println("Area of rectangle: " + r.area());
  }
}

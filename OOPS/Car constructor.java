class Car{
  String make;
  String model;
  int year;
  Car(String m, String mo, int y){
    make = m;
    model = mo;
    year = y;
  }
  void display(){
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}
public class R192311291{
  public static void main(String[] args){
    Car c = new Car("Toyota", "Innova", 2022);
    c.display();
  }
}

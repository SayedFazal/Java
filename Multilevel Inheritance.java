class Vehicle{
  void Vehiclediaplay(){
    System.out.println("Vehicle");
  }
}
class TwoWheeler extends Vehicle{
  void TwoWheelerdisplay(){
    System.out.println("Two wheeler");
  }
}
class Bike extends TwoWheeler{
  void Bikedisplay(){
    System.out.println("Bike");
  }
}
public class R192311291{
  public static void main(String[] args){
    Bike b = new Bike();
    b.Vehiclediaplay();  
    b.TwoWheelerdisplay();   
    b.Bikedisplay();   
  }
}

class Vehicle{
    void Vehicledisplay(){
        System.out.println("Vehicle Class");
    }
}
class TwoWheeler extends Vehicle{
    void TwoWheelerdisplay(){
        System.out.println("Two wheeler");
    }
}
public class R192311291{
    public static void main(String[] args){
        TwoWheeler t = new TwoWheeler();
        t.Vehicledisplay();
        t.TwoWheelerdisplay();    
    }
}

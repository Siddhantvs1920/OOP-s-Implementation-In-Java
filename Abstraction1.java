package Oops;

public class Abstraction1 {
    public static void main(String[] args) {
        AbstVehical a=new AbstCar();
        a.Start();
        a.drive();
        AbstScooter s=new AbstScooter();
        s.Start();
    }
}

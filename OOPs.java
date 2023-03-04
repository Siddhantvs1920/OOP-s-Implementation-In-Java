package Oops;

public class OOPs {
    public static void main(String[] args)
    {
         Pen pen1=new Pen();
         pen1.colour="Blue";
         pen1.type="bollpoint";

        Pen pen2=new Pen();
        pen2.colour="Black";
        pen2.type="Gel";


        pen1.penColour();
        pen2.penColour();


    }
}
class Pen{
    String colour;
    String type;

    public void write()
    {
        System.out.println("Writing");
    }
    public void penColour(){
        System.out.println(this.type);
    }
}

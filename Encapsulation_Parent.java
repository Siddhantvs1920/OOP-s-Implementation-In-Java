package Oops;

public class Encapsulation_Parent {
    public static void main(String[] args)
    {
        Encapsulation_Child e=new Encapsulation_Child();
        e.setAcbalance(1000);//pass value by setter method
        System.out.println("Remaining Balance is : "+e.getAcbalance());

    }
}

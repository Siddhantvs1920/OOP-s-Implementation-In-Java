package Oops;

public class Encap_Parent1
{
    public static void main(String[] args)
    {
        Child1 cv=new Child1();
        cv.setEmpId(100);
        System.out.println("Employee id is : "+cv.getEmpId());
    }
}

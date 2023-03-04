package Oops;

import java.util.Scanner;

public class Child extends Parent {
    public Child(){
        super();
        System.out.println("hello i am child");
    }
    public void add(){

        int a=20;
        int b=10;
        int c=a+b;
        System.out.println(c);
    }
    public void sub(){
        System.out.println("sub");
    }

}

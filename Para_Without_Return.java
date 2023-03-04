package Oops;

public class Para_Without_Return {
    public static void main(String[] args) {
        int p=10000;
        int n=2;
        int r=10;
        siCalc(p,n,r);
    }
    public static void siCalc(int p, int n, int r)
    {

        int si=p*n*r/100;
        System.out.println(si);
    }
}

package Oops;

public class NonParaWithReturn {
        public static void main(String[] args) {
           int num=siCalc();
            System.out.println(num);
        }
        public static int siCalc()
        {
            int p=10000;
            int n=2;
            int r=10;
            int si=p*n*r/100;
            return si;
        }



}

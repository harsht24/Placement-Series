package Recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(factorial(4));
//            nDecreasing(7);
//            System.out.println();
//            nIncreasing(7);
//            printDecreasingIncreasing(8);
    //        System.out.println(powerLinear(2,4));
            TowerOfHanoi toh = new TowerOfHanoi();
            toh.towerOfHanoi(3, 10, 20, 30);
    }
    public static int factorial(int n){
       if (n==0) return 1;
        return n * factorial(n-1);

    }
    public static void nDecreasing(int n){
        if (n==0) return;
        System.out.print(n+" ");
        nDecreasing(n-1);

    }
    public static void nIncreasing(int n) {
        if (n == 0) return;
        nIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void printDecreasingIncreasing(int n){
            if (n==0) return;
            System.out.println(n+" ");
            printDecreasingIncreasing(n-1);
            System.out.println(n+" ");
        }

    public static int powerLinear(int x, int n) {
        // https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-linear-official/ojquestion
            if (n==0) return 1;
            int xnm1 = powerLinear(x,n-1);
            int xn = xnm1*x;
            return xn;

    }


}

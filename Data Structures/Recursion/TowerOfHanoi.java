package Recursion;

public class TowerOfHanoi {
    public void towerOfHanoi(int n, int t1, int t2,int t3) {
        if(n==0) return;
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println(n+"["+t1+"->"+t2+"]");
        towerOfHanoi(n-1, t3, t2, t1);
    }
}

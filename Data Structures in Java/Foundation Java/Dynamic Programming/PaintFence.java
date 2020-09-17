// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-fence-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long same = k*1;
        long different = k * (k-1);
        long total = same + different;
        
        for(int i=3; i<=n; i++){
            same = different * 1;
            different = total * (k - 1);
            total = same + different;
        }
        System.out.println(total);
    }
}
import java.io.*;
import java.util.*;
import java.lang.*;

class Scratch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*      For accepting space separated integers.
                   2
                   10 4
         */

        int t = Integer.parseInt(br.readLine()); // No. of test cases

        String str = br.readLine();
        String[] arr = str.split("\\s+"); // Taking input as a string array.
        int dart = Integer.parseInt(arr[0]);
        int chef = Integer.parseInt(arr[1]);


        System.out.println(Arrays.toString(arr));
        System.out.println("test case = "+t);
        System.out.println(dart);
        System.out.println(chef);


    }
}
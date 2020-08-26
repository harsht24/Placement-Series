package String;

import java.util.Scanner;

public class AddDifferenceBetweenTwo {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(addDifferenceBetween(str));
    }

    private static String addDifferenceBetween(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length()-1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            int diff = ch2 - ch1;

            sb.append(ch1);
            sb.append(diff);
        }
        sb.append(str.charAt(str.length() -1));
        return sb.toString();
    }

}

// input = "acadbe"
/*
Enter a String : 
acadbe
a2c-2a3d-2b3e

* */
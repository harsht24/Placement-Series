package String;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(toggleCase(str));
    }
    private static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            }
            else{
                ch = (char)(ch - 'A' + 'a');
            }
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
}


/*

Enter a String : 
AAbabCdCCCFfrEOU
aaBABcDcccfFReou

*/

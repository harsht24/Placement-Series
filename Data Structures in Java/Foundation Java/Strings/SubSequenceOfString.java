package String;

public class SubSequenceOfString {
    public static void main(String[] args) {
        String s = "abc";

        for(int i = 0; i < (1<<s.length()); i++){  // loop ends on 2 power string.length()  or 2^(string.length)
            for(int j = s.length()-1; j>=0; j--){
                int mask = 1<<j;
                /*
                1010j01 to check whether j is 1 or not we apply this method,
                where we take AND of 1010j01 with 0000100.
                If the j bit is 0 then result will be 0000000 else 0000100.
                 */

                if((i & mask) !=0){
                    System.out.print(s.charAt(s.length()-1-j)+" ");
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}

/*

- - - 
- - c 
- b - 
- b c 
a - - 
a - c 
a b - 
a b c 

Process finished with exit code 0

*/
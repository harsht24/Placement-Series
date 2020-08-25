package String;

 class SubString {
     public static void main(String[] args) {
         String str = "abcde";

         getSubString(str);  // O(n^3) time complexity. O(n*n) for the loop and substring method has O(n).
     }

     private static void getSubString(String str){
         for(int i=0; i < str.length(); i++){
             for(int j=i+1; j <= str.length(); j++){
                 System.out.println(str.substring(i,j));
             }
         }
     }
}

/*

a
ab
abc
abcd
abcde
b
bc
bcd
bcde
c
cd
cde
d
de
e

*/

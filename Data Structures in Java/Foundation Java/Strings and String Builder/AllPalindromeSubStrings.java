package String;

public class AllPanlindromeSubstrings {
    public static void main(String[] args) {
        String str = "abccbc";
        getSubString(str);

    }
    private static void getSubString(String str){
        for(int i=0; i < str.length(); i++){
            for(int j=i+1; j <= str.length(); j++){
                System.out.print(str.substring(i,j)+ " - ");
                String temp = str.substring(i,j);
                System.out.println(isPalindrome(temp));
            }
        }
    }
    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
            i++;

        }
        return true;
    }
}





/*
a - true
ab - false
abc - false
abcc - false
abccb - false
abccbc - false
b - true
bc - false
bcc - false
bccb - true
bccbc - false
c - true
cc - true
ccb - false
ccbc - false
c - true
cb - false
cbc - true
b - true
bc - false
c - true
*/
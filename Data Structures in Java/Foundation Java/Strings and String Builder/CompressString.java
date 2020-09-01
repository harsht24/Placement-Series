package String;

class CompressStrirng {
    public static void main(String[] args) {
        String str = "aaabbcaaaddeefff";
        compress("Compress1 : "+str);
        System.out.println();
        compress2("Compress2 : "+str);

    }
    public static void compress(String str){
        for(int i=0; i<str.length()-1; i++){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(i+1);

           if(ch1 != ch2){
               System.out.print(ch1);
           }
        }
        System.out.print(str.charAt(str.length()-1));
    }

    public static void compress2(String str){
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(ch1 != ch2){
                System.out.print(ch1);
                if(count > 1){
                    System.out.print(count);
                }
                count = 1;
            }
            else{
                count++;
            }
        }
        System.out.print(str.charAt(str.length()-1));
    }
}


/*
Compres1 : abcadef
Compres2 : a3b2ca3d2e2f
*/
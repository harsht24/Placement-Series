class Solution {
    public boolean isPowerOfFour(int num) {
        
        if (num<=0) return false;
		String decInt = Integer.toBinaryString(num);
		
        int count=0;
        
        char[] ch = decInt.toCharArray();
        
        for(int i=1; i<ch.length; i++){
            
            if (ch[i]!='0') return false;
                count++;
        }
        return count%2==0;
    
    }
}
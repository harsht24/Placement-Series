// https://leetcode.com/problems/valid-parentheses/

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch==')' && st.size()>0){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch=='}' && st.size()>0){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch==']' && st.size()>0){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            else{
                    st.push(ch);      
            }
        }
        if(st.size()!=0){
            return false;
        }else{
            return true;    
        }
        
    }
}
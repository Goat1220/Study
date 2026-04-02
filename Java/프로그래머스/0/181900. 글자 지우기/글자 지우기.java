import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder text = new StringBuilder(my_string);
        
        int[] num = new int[indices.length];
        Arrays.sort(indices);
        
        for(int j = 0; j < indices.length; j++){
            num[j] = indices[indices.length - 1 - j];
            System.out.print(num[j]);
        }
  
         for(int i =0; i < indices.length; i++){
             text.deleteCharAt(num[i]);
         }

        answer = text.toString();
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] empty = {-1};
     
        int start = -1;
        int end = -1;
        ArrayList<Integer> nums = new ArrayList<>();        
        
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        
        if(start == -1){
            return empty;
        }

        return Arrays.copyOfRange(arr, start, end + 1);        
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i<arr.length;){
            if(nums.size() == 0 || nums.get(nums.size()-1) < arr[i]){
                nums.add(arr[i]);
                i++;
            }else{
                    nums.remove(nums.size()-1);
                }
            }
        
        
        int[] stk = new int[nums.size()];
        
        for(int j = 0; j < nums.size(); j++){
            stk[j] = nums.get(j);
            System.out.print(stk[j]);
        }
            
        
        return stk;
    }
}
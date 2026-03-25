import java.util.*;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i = l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){
                
                nums.add(i);
            }
        }
        
        int[] answer = new int[nums.size()];
        
        if(nums.size() == 0){
            return new int[]{-1};
        }else{
            for(int j =0; j<nums.size(); j++){
                answer[j] = nums.get(j);
            }
            return answer; 
        }
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        while(n != 1){
            nums.add(n);
            if(n % 2 == 0){
                n = n / 2;
           }else{
                n = 3 * n + 1 ;
            }          
        }
        
        nums.add(1);
        
        answer = new int[nums.size()];
        
        for(int i = 0; i < nums.size(); i++){
            answer[i] = nums.get(i);
        }
        
        
        return answer;
    }
}
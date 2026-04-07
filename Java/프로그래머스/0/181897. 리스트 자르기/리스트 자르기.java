import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList <Integer> nums = new ArrayList<>();
        
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
            
        
            switch(n){
                case 1:
                    for(int i = 0; i <= b; i++){
                        nums.add(num_list[i]);
                    }
                break;
                case 2:
                    for(int i = a; i <= num_list.length-1; i++){
                        nums.add(num_list[i]);
                    }
                break;
                case 3:
                    for(int i = a; i <= b; i++){
                        nums.add(num_list[i]);
                    }
                break;
                case 4:
                    for(int i = a; i <= b;){
                        nums.add(num_list[i]);
                        i+=c;
                    }
                break;
            }
        
        int[] answer = new int[nums.size()];
        for(int i =0; i<nums.size(); i++){
            answer[i] = nums.get(i);
        }
        return answer;
    }
}
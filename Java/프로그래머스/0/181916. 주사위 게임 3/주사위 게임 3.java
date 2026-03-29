import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] nums = {a,b,c,d};
        
        Arrays.sort(nums);
        
        a = nums[0];
        b = nums[1];
        c = nums[2];
        d = nums[3];
        
        
        if(a == d){
            answer = a * 1111;
        }else if (a == c){
            answer = (10 * a + d) * (10 * a + d);
        }else if (b == d){
            answer = (10 * b + a) * (10 * b + a);
        }else if (a == b && c == d){
           answer = (a + c) * ((a - c) * -1);
        }else if(a == b){
            answer = c * d; 
        }else if(a == c){
            answer = b * d;
        }else if(a == d){
            answer = b * c;
        }else if(b == c){
            answer = a * d;
        }else if(c == d){
            answer = a * b;
        }else{
            answer = a;
        }
        
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int j = 0;
        int i = 0;
        
        for(boolean x : included){
            j = a + d * i;
            if(x == true){
                answer += j;
            }
            i++;
        }
        return answer;
    }
}
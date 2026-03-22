import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for(int i =0; i < queries.length; i++){
            //int min1 = 1000001;
            for(int x = queries[i][0]; x <= queries[i][1]; x++){
                    // if(arr[x] > queries[i][2] && arr[x] < min1){
                    //     min1 = arr[x];
                    // }
                if(queries[i][2] < arr[x]){
                    answer[i] = answer[i] == -1 ? arr[x] : Math.min(answer[i], arr[x]);
                }
                }
                // answer[i] = min1 ==  1000001 ? -1 : min1;
            }
        return answer;
    }
}
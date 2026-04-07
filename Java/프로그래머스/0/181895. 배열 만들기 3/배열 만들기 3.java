class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int[] interval1 = intervals[0];
        int[] interval2 = intervals[1];
        
        int a = interval1[0];
        int b = interval1[1];
        int c = interval2[0];
        int d = interval2[1];
        
        int[] answer = new int[(b-a+1)+(d-c+1)];
        int j = 0;
        
        for(int i = a; i <= b; i++){
            answer[j] = arr[i];
            j++;
        }
        
        for(int i = c; i<= d; i++){
            answer[j] = arr[i];
            j++;
        }
        
        return answer;
    }
}
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        
        boolean x1x2 = false;
        boolean x3x4 = false;
        
        if(x1 == true || x2 == true){
            x1x2 = true;
        }
        if(x3 == true || x4 == true){
            x3x4 = true;
        }
        if(x1x2 == true && x3x4 == true){
            answer = true;
        }
        
        return answer;
        
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String a = "";
        String b = "";
        
        
        for(int i =0; i<my_string.length() / m; i++){
            a = my_string.substring(i*m, (i+1)*m);
            if(a.length() >= c){
                b = Character.toString(a.charAt(c-1));
                answer += b;
            }
        }
        System.out.print(answer);
        
        return answer;
    }
}
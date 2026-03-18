class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for(int i = 0; i < code.length(); i++){
            if(mode){
                if(Character.toString(code.charAt(i)).equals("1")){                    
                    mode = false;                                         
                }else{
                    if(i % 2 == 1){
                        ret += Character.toString(code.charAt(i));
                    }
                }
                //System.out.print(mode);
            }else{
                if(Character.toString(code.charAt(i)).equals("1")){                    
                    mode = true;                                         
                }else{
                    if(i % 2 == 0){
                        ret += Character.toString(code.charAt(i));
                    }
                }
            }
        }
        
        if(ret == "") ret="EMPTY";
        
        return ret;
    }
}
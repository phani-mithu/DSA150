class Solution {
public:
    bool isAnagram(string s, string t) {
      
        if(s.length() != t.length()){
            return 0;
        }else{
            sort(s.begin(), s.end());
            sort(t.begin(), t.end());  
            if( s != t ){
                return 0;
            }
        }
        return 1;    
    }
};

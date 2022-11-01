class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
       unordered_map<int, int> ump;
        
        for(auto i: nums){
            if(ump.find(i) != ump.end()){
                return true;
            }
            ump[i]++;
        }
        return false;
    }
};

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin() , nums.end());
        
        int ans = 0, temp = 0;
        int j = -1;
        
        for(int i = 0; i< n; i++){           
            if(j != -1 && nums[i] - nums[j] == 1 ){
               temp++; 
               j = i;  
            }else if( j != -1 && nums[i] - nums[j] == 0 ){
               continue; 
            }else{
                ans = max(ans, temp);
                temp = 1;
                j = i;
            }
        }
        
        ans = max(ans, temp);
        
        return ans;
    }
};

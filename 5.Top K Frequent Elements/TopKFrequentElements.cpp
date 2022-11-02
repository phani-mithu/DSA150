class Solution {
public:
	vector<int> topKFrequent(vector<int>& nums, int k) {
		unordered_map<int,int>ump;
		vector<pair<int,int>> vp;
    int n = nums.size();
        
		for(int i=0; i < n; ++i){
			ump[nums[i]]+=1;
		}
        
		for(auto x:ump){
			vp.push_back({x.second,x.first});
		}
        
		sort(vp.rbegin(), vp.rend());
    
		vector<int>ans(k);
    
		for(int i=0; i<k; ++i){
			ans[i] = vp[i].second;
		}
        
		return ans;
	}
};

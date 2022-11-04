

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
    int[] nums={0,0,0,0};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int l=nums.length;
            List<List<Integer>> ans=new ArrayList();
        for (int i = 0; i <l-2; i++) {
            System.out.println("ji");
             if(i!=0 && nums[i]==nums[i-1])
                 continue;
            Set<Integer> s=new HashSet<>();
            Set<Integer> u=new HashSet<>();
            for (int j = i+1; j < l; j++) {
                int t=0-nums[i]-nums[j];
                System.out.println(s);
                if(s.contains(t) && !u.contains(t) &&  !u.contains(nums[j]))
                {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(t);
                    ans.add(temp);
                    u.add(t);
                    u.add(nums[j]);
                }
                s.add(nums[j]);
            }

        }
        return ans;
    }
}

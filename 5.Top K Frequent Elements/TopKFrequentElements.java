import java.util.*;

public class kFrequentelements {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(m.containsKey(nums[i]))
               m.put(nums[i],m.get(nums[i])+1);
           else
               m.put(nums[i],1);
        }
        List<Integer> l = new ArrayList<>(m.values());
        Collections.sort(l);
        int[] ans=new int[k];
        int index=0;
        int t=  l.get((l.size()-k));
        for (int i : m.keySet()) {
            if (m.get(i) >= t)
                ans[index++]=i;
        }
        return ans;
    }
}

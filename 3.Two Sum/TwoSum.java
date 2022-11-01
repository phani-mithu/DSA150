import java.util.*;;

public class Twosum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=18;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> temp=new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(target-nums[i]))
            return new int[]{temp.get(target-nums[i]),i};
            else
            temp.put(nums[i],i);
        }
        return null;
    }
}

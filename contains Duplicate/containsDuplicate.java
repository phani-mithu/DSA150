import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
      int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
         //sort and check nlogn,space -1
        //map o(n),space o(n)
        //set o(n),space o(n)
       Set<Integer> s=new HashSet<>();
        for (int n:
             nums) {
            if(!s.add(n))
                return true;

        }
        return  false;
    }
}

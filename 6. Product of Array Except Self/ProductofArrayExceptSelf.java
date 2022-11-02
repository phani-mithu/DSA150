import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
        public static int[] productExceptSelf(int[] nums) {
            int zero=0,prod=1,l=nums.length;
            int[] ans=new int[l];
            for(int i=0;i<l;i++)
            {
                if(nums[i]!=0 )
                    prod*=nums[i];
                else{
                    zero++;
                    if(zero>1)
                        return ans;
                }
            }
            for(int i=0;i<l;i++)
            {
                if(zero==0)
                    ans[i]=prod/nums[i];
                if(zero==1 && nums[i]==0)
                    ans[i]=prod;
                // else
                //     nums[i]=0;
            }
            return ans;
        }
    }


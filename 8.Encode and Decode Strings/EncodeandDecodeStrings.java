package Days150;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeStrings {
    public static void main(String[] args) {
        List s=new ArrayList();
        s.add("lint");
        s.add("code");
        s.add("::;");
        s.add("love");
        s.add(":;");
        s.add("You");

        s.add(":");
        s.add("You");
        s.add(":;");
        System.out.println(encode(s));
        System.out.println(decode(encode(s)));
    }
    public static String encode(List<String> strs) {
        // write your code here
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<strs.size();i++)
        {
            String temp=strs.get(i);
            if(temp.indexOf(":")==-1 )
                sb.append(temp);
            else {
                for(int j=0;j<temp.length();j++)
                {
                    if(temp.charAt(j)==':')
                        sb.append(":");
                    sb.append(""+temp.charAt(j));
                }
            }
            sb.append(":;");

        }
        return sb.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        List<String> ans=new ArrayList<>();
        StringBuffer temp = new StringBuffer();
        int l=str.length();
        for(int i=0;i<l;i++){
            char c=str.charAt(i);
            if(c!=':')
                temp.append(c);
            else{
                if(i<l-1 && str.charAt(i+1)!=';')
                {
                    temp.append(str.charAt(i+1));
                }
                else
                {
                    ans.add(temp.toString());
                    temp=new StringBuffer();
                }
                i++;
            }

        }
        return ans;

    }
}

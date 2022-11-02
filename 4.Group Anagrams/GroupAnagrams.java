import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] srts={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(srts));
    }
    public static boolean anagram(String s1,String s2){
        int l=s1.length();
        if(l!=s2.length())
            return false;
        int[] alpha=new int[26];
        for (int i = 0; i <l; i++) {
            alpha[s1.charAt(i)-'a']++;
            alpha[s2.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(alpha[i]!=0)
                return false;
        }
        return true;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ll=new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            boolean inserted=false;
            for (int j = 0; j < ll.size(); j++) {
                if(anagram(ll.get(j).get(0),strs[i]))
                {
                    ll.get(j).add(strs[i]);
                    inserted=true;
                    break;
                }
            }
            if (!inserted)
            {
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                ll.add(l);
            }
        }
        return ll;
    }
}

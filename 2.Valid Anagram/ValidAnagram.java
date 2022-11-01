public class ValidAnagram {
    public static void main(String[] args) {
     String s="anagram";
     String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int l=s.length();
        if(t.length()!=l)
            return false;
        int[] alpha=new int[26];
        for (int i = 0; i <l ; i++) {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(alpha[i]!=0)
                return false;
        }
     return true;
    }
}

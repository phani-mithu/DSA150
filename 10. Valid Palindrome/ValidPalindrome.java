

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Sore was I ere I saw Eros."));
    }
    public static boolean isPalindrome(String s) {
        int right=s.length()-1,left=0;
        while (left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            System.out.println(l+" "+r);
        if(l>='A' && l<='Z')
            l=(char)(l-'A'+'a');
        if(r>='A' && r<='Z')
            r=(char)(r-'A'+'a');
        if(!((l<='z' && l>='a')|| (l<='9' && l>='0')))
        {
            left+=1;
            System.out.println("l");
            continue;
        }
        else if(!((r<='z' && r>='a')|| (r<='9' && r>='0'))) {
            right -= 1;
            System.out.println("r "+r);
            continue;
        }
            System.out.println(l+" "+r);
        if(r!=l)
                return false;
            else {
                left+=1;
                right-=1;
            }
        }

       return true;
    }
}

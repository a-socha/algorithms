package longestPalindromicSubstring;

public class LongestPalinbdromicSubstring {

    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String subs = s.substring(j, i+j );
                if(isPalindrom(subs))
                    return subs;
            }
        }
        throw new IllegalArgumentException("ni ma palindromu");
    }

    private boolean isPalindrom(String s) {
        return s.length() <= 1 || (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrom(s.substring(1, s.length() - 1)));
    }

}
